const http = require('http');
const fs = require('fs').promises;
const path = require('path');

const users = {}; //데이터 저장용

http.createServer(async (req, res) => {
    try {
        console.log(req.method, req.url );
        if(req.method === 'GET') {
            if(req.url=== '/') {
                const data = await fs.readFile(path.join(__dirname, 'restFront.html'));
                res.writeHead(200, {'Content-Type' : 'text/html; charset=utf-8'});
                return res.end(data);
            } else if (req.url === '/about') {
                const data = await fs.readFile(path.join(__dirname, 'about.html'));
                res.writeHead(200, {'Content-Type' : 'text/html;  charset=utf-8'});
                return res.end(data);
            } else if (req.url === '/about') {
                const data = await fs.readFile(path.join(__dirname, 'about.html'));
                res.writeHead(200, {'Content-Type' : 'text/html; charset=utf-8'});
                return res.end(data);
            } else if (req.url === '/users') {
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
                    
                })
            }
                
        }
    }
})