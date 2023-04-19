//reactFront.js는 html에서 작성한 페이지의 데이터를 넘겨 받아오는 함수를 정의해 놓았다. 
//  유저 정보를 생성, 수정, 삭제 및 조회하는 간단한 유저 관리 애플리케이션의 클라이언트 사이드 코드

async function getUser() {
    try { //responst에들어갈 데이터들 (reactFront.html에 들어갈 데이터들을 정의해놓음 : async-await axios로!)
        const res = await axios.get('/users');  // /users(서버의 데이터 저장소)와 연결 요청해준다.  : '/users' API endpoint 에 GET 요청
        //서버로부터 응답(response)을 받아오는 코드
        const users= res.data; // /users의 데이터를 받아옴 서버에서 전달된 사용자 정보가 배열의 형태로 담겨있다. 
        const list = document = getElementById('list'); //HTML에서 id가 'list'인 요소를 찾아서 list 변수에 할당하는 코드 
        list.innerHTML = ''; //이전에 추가된 사용자 목록을 모두 지우는 역할

        //사용자마다 반복적으로 화면 표시와 이벤트를 연결해준다.
        Object.keys(users).map(function (key) { // Object.keys() : 객체의 key 값들을 배열로 반환해주는 함수 
            //.map(function(key)) : 서버에서 받아온 사용자 정보를 이용하여 사용자 목록(key값을 파라미터로 하여)을 생성하고 각각의 key 값에 대해 function (key) 함수를 실행
            const userDiv = document.createElement('div'); //로운 div 엘리먼트를 생성합니다. 이 엘리먼트는 각 사용자 정보를 담을 컨테이너 역할을 함
            const span = document.createElement('span'); //새로운 span 엘리먼트를 생성합니다. 이 엘리먼트는 사용자 이름을 표시하기 위한 역할을 함
            span.textContent = users[key]; //span 엘리먼트의 텍스트를 서버에서 받아온 사용자 이름으로 설정해준다. 
            const edit = document.createElement('button'); // 새로운 button 엘리먼트를 생성해주고 해당 사용자 정보를 수정하기 위한 버튼 역할을 한다. 
            edit.textContent = '수정'; // edit 버튼의 텍스트를 '수정'으로 설정
            edit.addEventListener('click', async () =>{
                //수정 버튼을 클릭한다. 
                
                const name = prompt('바꿀 이름을 입력해주세요.');
                if(!name) {
                    return alert('이름을 반드시 입력하셔야 합니다.');
                }
                try {
                    await axios.put('/users/' + key,{name}); //axios.put() :  해당 사용자의 이름을 서버에 전송
                    // , 첫 번째 인자로는 /users/와 해당 사용자의 고유 id값을 전달하여 수정 요청을 보내주기를 한다. 
                    //  두 번째 인자로는 {name} 객체를 전달하여 새로운 이름을 서버에 보내준다. 
                    getUser();
                    // 수정된 사용자 목록을 다시 받아오고 화면에 출력해준다. 
                }catch(err){
                    console.error(err); //수정 요청 중 에러가 발생하면, console.error() 함수를 호출하여 에러 메시지를 출력해준다.
                }
            });
            const remove = document.createElement('button');
            remove.textContent = '삭제';
            remove.addEventListener('click', async () =>{ //버튼을 클릭하면 async함수가 실행된다. 
                //삭제 버튼 클릭
                try {
                    await axios.delete('/user/'+key); //첫 번째 인자로는 /users/와 해당 사용자의 고유 id값을 전달하여 삭제요청을 한다.
                    getUser(); // 요청이 성공하면 getUser()함수로 화면을 갱신해준다. 
                } catch(err) {
                    console.error(err);
                }
            });
            userDiv.appendChild(span); //새로운 사용자 정보로 위에서 만들어준것이고,  span, edit, remove 요소들은 userDiv 안에 추가된다. 
            userDiv.appendChild(edit);
            userDiv.appendChild(remove);
            list.appendChild(userDiv); // list 요소에 userDiv를 추가하여(appendChild) 새로운 사용자 정보가 화면에 나타나게 된다. 
            console.log(res.data); // 서버에서 받아온 사용자 정보를 콘솔에 출력한다. 
        
        });
    } catch(err) {
        console.error(err);
    }
}

window.onload = getUser; //화면 로딩할 때 getUser을 호출하기

//폼 제출시에 실행하기
document.getElementById('form').addEventListener('submit', async(e)=>{
    //  form의 submit 이벤트가 발생하면, async 함수가 실행된다. 
    e.preventDefault(); //기본 동작인 form의 submit을 막는다. 
    const name = e.target.username.value; // form 태그 안에 있는 input 요소의 name 속성이 username인 요소의 값을 target으로 하여 가져온다. 
    if(!name) {
        return alert('이름을 입력하세요');
    }
    try {
        await axios.post('/user', {name}); // axios를 이용하여 POST 요청을 보낸다. 요청 URL은 /user이며, 요청 바디에는 새로 추가할 사용자의 이름을 담은 객체 {name}를 보낸다.
        getUser(); //서버에서 사용자 목록을 받아와 화면을 업데이트한다. 
    } catch(err) {
        console.error(err);
    }
    e.target.username.value = ''; // 사용자 이름을 입력한 input 요소의 값을 비운다. 
});