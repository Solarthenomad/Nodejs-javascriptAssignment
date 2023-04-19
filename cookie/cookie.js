const http = require('http');
const fs  = require('fs').promises;
const path = require('path');

const parseCookies = (cookie='') =>{
    cookie.split(';').map(v => v.split('=')).reduce((acc, [k, v])=> {
        acc[k.trim()] = decodeURIComponent(v);
        return acc;

    }, {});
}

//parseCookies 함수 :  문자열 형태의 쿠키 정보를 파싱해 객체로 반환함
// 반환된 객체은 각각 쿠키 이름ㅇ르 속성 이름으로, 쿠키 값들은 속성 값으로 갖게 된다. 
//cookie.split(';') : cookie 문자열을 세미콜론(;)을 구분자로 사용해 배열로 분리한다. 
//각각 하나의 쿠키 정보를 담고 있는 문자열을 요소로 갖게 된다. 
// map(v => v.split('='))
//:  쿠키 정보를 = 기호를 구분자로 사용해 다시 배열(키 = 속성)로 분리한다. 분리된 배열은 쿠키 이름과 쿠키 값으로 이루어진 두 요소를 갖게 된다. 
// reduce((acc, [k, v])=> {acc[k.trim()] = decodeURIComponent(v);}
// 이전 요소에서 반환된 객체(acc)에 새로운 요소를 추가한다. 
// 키 이름(k)은 trim() 함수를 이용해 좌우 공백을 제거한다. 
//  쿠키 값(v)은 decodeURIComponent() 함수를 이용해 URI 디코딩해준다.
// 위와 같은 과정은 문자열 형태의 쿠키 정보를 파싱해 객체로 반환해주는 과정이다. 
http.createServer(async (req, res) => {
    const cookie = parseCookies(req.headers.cookie);


//주소가 /login으로 시작하는 경우
if(req.url.StartsWith('/login')) {  // /login은 상대 경로 형태임
    const url = new URL(req.url, 'http://localhost:8084'); // req.url 값을 URL 객체로 변환하는 것을 의미하고 두 번째 인자 'http://localhost:8084'는 기본 URL을 설정하는 값으로, 상대 경로를 절대 경로로 변환한다.
    const name = url.searchParams.get('names');  //URLSearchParams.get(names) :  요청 URL의 쿼리 스트링(input id = name)에서 names 매개변수 값을 가져와 name에 할당해준다. 
    const expires = new Date();  //expires 변수 :쿠키의 만료 날짜와 시간을 설정할 때 사용함 
    // 쿠키 유효 시간을 현재시간 + 5분으로 하기 
    expires.setMinutes(expires.getMinutes() + 5);
    res.writeHead(302, {
        Location:'/', //Location 필드를 설정하여 리디렉션을 수행해준다. 
        'Set-Cookie' : 'name = ${encodeURIComponent(name)}; Expires=${expires.toGMTString()}; HttpOnly; Path=/`,'
        // name변수에 저장된 값을 인코딩한 후 쿠키의 이름으로 설정해준다. 
        // Expires필드에는 이전에 설정한 만료 날짜와 시간 정보를 설정해주는데, 이때 toGMTString형태로 바꿔준다. 
        // Path ='/'로 설정해주어 쿠키의 유효 경로를 전체 사이트로 설정해준다. 

    });
    res.end();
}

//주소가 /이면서 name이라는 cookie가 있는 경우 

else if (parseCookies.name) {
    // 쿠키에 name이라는 이름으로 저장된 값을 검사해준다음에
    res.writeHead(200, {'Content-Type' : 'text/pain; charset=utf-8'});
    res.end('${cookies.name}님 안녕하세요!'); //있으면 저장된 사용자 이름을 포함한 문구를 응답으로 반환해준다. 
}else { // 주소가 /이면서 쿠키가 없는 경우 
    try{
    const data =await fs.readFile(path.join(__dirname, 'cookie.html'));
    res.writeHead(200, {'Content-Type' : 'text/html; charset=utf-8'});
    res.end(data);
} catch(err) {
    res.writeHead(500, {'Content-Type' : 'text/plain; charset=utf-8'});
    res.end(err.message);
}

}

})
.listen(8084, () => {
    console.log('8084번 포트에서 서버 대기 중입니다!');
})
