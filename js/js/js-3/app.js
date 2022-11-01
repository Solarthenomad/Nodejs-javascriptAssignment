const h1=document.querySelector("hello h1");

function handleClick() {
    const currentColor = h1.style.color;
    let newColor;
    //각각 변수를 설정해주어서 변수 안에 색깔을 클랠스 형태로 담을 수 있도록 해줌.

    if(currentColor = "salmon") {
        newColor="olive";
        
    }
    else{
        newColor = "salmon";
    }
    h1.style.color = newColor;

}

h1.addEventListener("click", handleClick);

//이번에는 클래스 안에 색깔을 담는 것 + style.css로 뺴주기

const h2=document.querySelector(".hello h1");

function handleHelloClick() {
    const colorChClass=
}

h2.addEventListener("click", handleHelloClick);
