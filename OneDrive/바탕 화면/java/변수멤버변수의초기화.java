public class 변수멤버변수의초기화 {

    //지역변수는 수동으로 초기화 해야함
    //예시
    class initTest{
        int x;   //인스턴스 변수
        int y =x;  //인스턴스변수는 그냥 초기화 가능


        void method1() {
            int i;    //지역변수
            int j = ㅑ;  //에러가 생김 , 지역변수를 초기화하지 않고 사용했기 때문에

        }
    }

    //멤버변수를 초기화시켜주기
    //1. 명시적 초기화
    class Car {
        int door = 4;  //기본형 변수의 초기화
        Engine e = new Engine(); //참조형 변수의 초기화
        //참조형 변수 : null, 객체주소 이 두가지가 있음

    }

    //초기화 블럭   : 복잡한 초기화에서 여러 문자를 사용할 때 쓴다.
    //인스턴스 초기화 블럭처리 : {}
    //클래스 초기화 블럭 처리 : static {}

    //생성자 : 초기화, 복잡한 초기화에서 사용한다.그런데 사실상 복잡한 초기화는 주로 사용되지 않는다.
    Car(String color, String gearType, int door ){
        this.color = color ;
        this.gearType = gearType;
        this.door =door;
    }

    class StaticBlockTest {
        static int[] arr = new int[10];

        static {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random()*10)+1;

            }
        }
    }

    //멤버 변수의 초기화
    //클래스 변수 초기화 시점 : 클래스가 처음으로 로딩될 때(메모리가 올라갈 때) 단 한번만
    //인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때마다

    class InitTest {
        static int classvariable = 1;  //명시적 초기화
        int instancevariable = 1;  //명시적 초기화

        static {classvariable = 2;}  //클래스 초기화 블럭
        {instancevariable = 2;}   //인스턴스 초기화 블럭

        InitTest() {
            instancevariable = 3;
        }
    }



}
