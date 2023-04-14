let a= 3;
let b= 1.77;

console.log(a);
console.log(b);


//문자형 변수 

let str1= "안녕";
let str2 = "하세요";

console.log(str1+str2);


//null(비어있음 선언) vs undefined(정의되지 않음)

//undefined(정의되지 않음 표현 방법)
let a;
console.log(a);

//null(비어있음 선언방법)
let a=0;
console.log(a);

//let vs var



function sayHi() {
    console.log("Hello");
}

function sayHi(myname) {
    print("Hello"+myname);
}

sayHi("solar");

function sayHi(myName, myAge){
      console.log("My nmae is" + myName);
      console.log("My age is" + myAge);
}

//const let var은 무조건 함수 앞에 있는 것이 불가능함!! 무조건 명사 앞에 있어야됨!
const Player={
    sayName : function(myName){
        console.log("My name is"+ myName)
    },
    sayAge : function(myAge){
        console.log("My age is" + myAge)
    }
}


//오브젝트 안에 /

Player.sayName("Paraengi");
Player.sayAge("19");


