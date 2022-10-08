const hi=document.getElementById("hi");
hi.innerText("hello");

//queryselector 사용해서 document 안의 객체를 가져와보기
const hello = document.querySelector("hello div");

//EventLister로 함수
hello.addEventListener("onclick", handleHelloClick)

//우선 
function handleHelloClick=()=>{
    hello.innerText("안녕하세요.")
}

hello.addEventListener("onmouseover", );
hello.addEventListener("onmouseout", handle)

function handleHelloClick=()=>{
    hello.innerText="이 단어는 마우스가 올라왔습니다. "
}
function hadnle
