public class 객체지향언어 {

    //소스파일의 이름은 public class이름과 일치해야함

    //캡슐화, 상속, 추상화, 다형성
    //객체 지향 언어 = 프로그래밍 언어 + 객체지향개념(규칙) - 규칙은 필사하면서 익혀야 한다.
    //클래스 : 객체를 생성하는데 사용한다.

    //객체 = 속성(변수) : 크기 길이 높이 색상 볼륨 채널등 = 인스턴스와 같은 말
    //기능 : 켜기 끄기 볼륨 높이기 등

    //설계도(클래스)를 가지고 객체(제품)을 만드는 것!이것을 인스턴스화라고 한다.

    //한 파일 여러 클래스 작성하기

    public static void main(String[] args) {
        Tv t;
        t = new Tv();   //t =  new Tv(); Tv인스턴스를 생성한다.
        t.channel = 7;  //Tv 인스턴스의 멤버변수 channel의 값은 7이다.
        t.channelDown();  //Tv인스턴스의 메서드 channelDown을 호출한다.
        System.out.println("현재 채널은" + t.channel + "입니다");
    }










}
class Hello{}
//하나의 파일 안에 클래스 여러개 만드는 것도 가능하다.
//하나의 소스파일에는 하나의 public class만 허용함
//하나의 소스파일에는 다만 하나의 클래스만 작성하는 것이 바람직하긴 함


//객체의 생성
//1.클래스명 변수명;
//Tv t;   //Tv 클래스 타입의 참조변수 t를 선언해주는 것
//2.변수명 = new 클래스명();  //클래스의 객체를 생성 후 객체의 주소를 참조변수에 저장함
//t = new Tv();
//Tv 인스턴스를 생성한 후 생선된 Tv 인스턴스의 주소를 t에 넣는다.

//객체의 사용
//t.channel = 7; Tv 인스턴스의 맴버변수 channel의 값을 7로 한다
//t.channelDown();   Tv인스턴스 메서드 channelDown()을 호출해준다.

//t라는 객체 안에 별도의 저장공간(channel)이 생성되게 되는 것

//하나의 인스턴스를 여러 개의 참조 변수가 가리키는 경우는 가능하지만
//여러 인스턴스를 하나의 참조변수가 가리키는 경우는 불가능하다.

class Tv { // Tv라는 인스턴스(클래스를 만들어줌) 클래스 = 설계도
    //Tv의 속성 = 멤버변수에는 color, power, channel들이 있다.
    String color;
    boolean power;
    int channel;
    //TV의 속성을 선언해줌

    //Tv의 기능
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
        //TV의 채널을 높이는 기능(++channel)
    }
    void channelDown() {
        --channel;
        //TV의 채널을 낮추는 기능(--channel)
    }

}
