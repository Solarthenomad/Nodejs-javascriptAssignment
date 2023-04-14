//day, weather 둘다 undefined로 처리를 해주어야 하기 때문에 그냥 비워놓음. 사용자가 '선택'을 하는 상황일 때 맨첫번째로 해주어야 하는 것
let day ="";
let weather="";

//날씨랑 요일이 선택되면 문구를 띄어줄 것. div text에 띄어주게 된다.
function dayweather=()=>{
      if(day!==""&&weather!==""){
        const text=document.querySelector(".text");
        /**/ 
        text.innertext("날씨가" + weather + "인" +"요일이네요!");

        if(weather === "맑음"){
            document.body.style.backgroundColor="skyblue";
        }
        if(weaher ==="흐림")
      }
}

//사용자가 요일을 클릭했음을 인식할 수 있도록 해줌

const weak = document.querySelectorAll(".week");

week[0].addEventListener("onclick", handleMonClick);
week[1].addEventListener("onClick", handleTuesClick);
week[2].addEventListener("onClick", handleWedClick);

function handleMonClick=()=>{
    day = week[0].innertext;
    dayweather();
}
function handleTuesClick=()=>{
    day = week[1].innertext;
    dayweather();
}
function handleWedClick=()=>{
    day = week[2].innertext;
    dayweather();
}

function handleThusClick=()=>{
    day = week[3].innertext;
    dayweather();
}
//앞에서의 html 요소들을 배열값으로 자동으로 가져옴
const weather = document.querySelectorAll(".weather");

weather[0].addEventListener("click",handleSunnyClick);

function handleSunnyClick=()=>{
    //weather
    weather = weather[0].inntertext;
    dayweather();
}