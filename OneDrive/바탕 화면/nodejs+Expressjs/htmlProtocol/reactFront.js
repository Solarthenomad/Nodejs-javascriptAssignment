//reactFront.js는 html에서 작성한 페이지의 데이터를 넘겨 받아오는 함수를 정의해 놓았다. 

async function getUser() {
    try {
        const res = await axios.get('/users');
        const users= res.data;
        const list = document = getElementById('list');
        list.innerHTML = '';
        //사용자마다 반복적으로 화면 표시와 이벤트를 연결해준다.
        Object.keys(users).map(function (key) {
            const userDiv = document.createElement('div');
            const span = document.createElement('span');
            span.textContent = users[key];
            const edit = document.createElement('button');
            edit.textContent = '수정';
            edit.addEventListener('click', async () =>{
                //수정 버튼을 클릭한다. 
                const name = prompt('바꿀 이름을 입력해주세요.');
                if(!name) {
                    return alert('이름을 반드시 입력하셔야 합니다.');
                }
                try {
                    await axios.put('/users/' + key,{name});
                    getUser();
                }catch(err){
                    console.error(err);
                }
            });
            const remove = document.createElement('button');
            remove.textContent = '삭제';
            remove.addEventListener('click', async () =>{
                //삭제 버튼 클릭
                try {
                    await axios.delete('/user/'+key);
                    getUser();
                } catch(err) {
                    console.error(err);
                }
            });
            userDiv.appendChild(span);
            userDiv.appendChild(edit);
            userDiv.appendChild(remove);
            list.appendChild(userDiv);
            console.log(res.data);
        
        });
    } catch(err) {
        console.error(err);
    }
}

window.onload = getUser; //화면 로딩할 때 getUser을 호출하기

//폼 제출시에 실행하기
document.getElementById('form').addEventListener('submit', async(e)=>{
    e.preventDefault();
    const name = e.target.username.value;
    if(!name) {
        return alert('이름을 입력하세요');
    }
    try {
        await axios.post('/user', {name});
        getUser();
    } catch(err) {
        console.error(err);
    }
    e.target.username.value = '';
});