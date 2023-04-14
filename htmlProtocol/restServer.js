const http = require('http');
const fs = require('fs').promises;
const path = require('path');

const users = {}; //데이터 저장용

http.createServer(async (req, res) => {
    try {
        console.log(req.method, req.url ); //  req.method와 req.url을 통해 클라이언트의 요청 메소드와 주소를 파악하고, 그에 따른 응답을 생성해준다. 
        if(req.method === 'GET') {
            if(req.url=== '/') {
                const data = await fs.readFile(path.join(__dirname, 'restFront.html'));
                res.writeHead(200, {'Content-Type' : 'text/html; charset=utf-8'});
                return res.end(data);
            } else if (req.url === '/about') {
                const data = await fs.readFile(path.join(__dirname, 'about.html'));
                res.writeHead(200, {'Content-Type' : 'text/html;  charset=utf-8'});
                return res.end(data);
            } 
            else if (req.url === '/users') {
                res.writeHead(200, {'Content-Type': 'text/pain; charset=utf-8'});
                return res.end(JSON.stringify(users));
            }
            // /, /about, /users도 아니면
            try {
                const data = await fs.readFile(path.join(__dirname, req.url));
                return res.end(data);
            } catch (err) {
                // 주소에 해당하는 라우터를 찾지 못했다는 404 Not Found Error 발생 페이지 그냥 뜨게 함
            } 
        }else if(req.method ==='POST') {
            if (req.url === '/user') {
                let body = '';
                //요청의 body를 스트림 형태로 받는다. 
                req.on('data', (data) => {
                    body += data;
                });
                //요청의 body를 다받은 후에 실행된다.
                return req.on('end', ()=>{
                    console.log('POST 본문(Body):', body);
                    const {name} = JSON.parse(body);
                    const id = Date.now();
                    user[id] = name;
                    res.writeHead(201, {'Content-Type' : 'text/html; charset=utf-8'});
                    res.end('등록 성공');
                });
            }
                
        } else if (req.method==='PUT') {
            if(req.url.startsWith('/user/')){
                const key = req.url.split('/')[2];
                let body = '';
                req.on('data', (data) =>{
                    body += data;
                });
                return req.on('end', ()=>{
                    console.log('PUT 본문(BODY):', body);
                    users[key] = JSON.parse(body).name;
                    res.writeHead(200, {'Content-Type':'text/html; charset=utf-8'});
                    return res.end(JSON.stringify(users));
                });
            }
        } else if(req.method === 'DELETE') {
            if(req.url.startsWith('/user/')) {
                const key = req.url.split('/')[2];
                delete users[key];
                res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
                return res.end(JSON.stringify(users));
            }

        }
        res.writeHead(404);
        return res.end('NOT FOUND');

    } catch(err) {
        console.error(err);
        res.writeHead(500);
        res.writeHead(500, {'Content-Type' : 'text/plain; charset=utf-8'});
        res.end(err);
    }
}).listen(8082, ()=>{
    console.log('8082번 포트에서 서버 대기중입니다.');
})