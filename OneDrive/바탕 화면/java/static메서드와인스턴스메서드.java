public class static메서드와인스턴스메서드 {

    //인스턴스 메서드
    //인스턴스 생성 후 '참조변수.메서드이름()'으로 호출하기
    //인스턴스 멤버(iv, im)과 관련된 작업을 하는 메서드
    //메서드 내에서 인스턴스 변수(iv) 사용이 가능하다.
    //개별 속성

    //static 메서드(클래스 메서드)
    //객체 생성없이 클래스이름.메서드이름()으로 호출해주기
    //인스턴스 멤버(iv, im)와 관련없는 작업ㅇ르 하는 메서드
    //메서드 내에서 인스턴스 변수(iv) 사용이 불가능하다.
    //속성(멤버 변수) 중에서 공통 속성에 static을 붙여야 함

   class MyMath2 {
       long a,b;

       long add() {
           return a + b;
       }

       static long add(long a, long b){
           return a+b;
       }
   }

    static long add(long a, long b) {   //클래스 메서드(static 메서드)
        return a+b;
    }

    class MathTest2 {
        public static void main(String[] args) {
            System.out.println(MyMath2.add(200L, 100L));   //클래스메서드 호출  MyMath2 = 클래스 이름
            MyMath2 mm = new MyMath2();    //인스턴스 생성
            mm.a =200L;   //mm은 참조변수
            mm.b = 100L;
            System.out.println(mm.add());  //인스턴스메서드 호출
        }

    }

    class TestClass2 {
       int iv;    //인스턴스 변수 : 객체 생성 후 사용이 가능하다.
        static int cv; //클래스 변수 : 언제나 사용이 가능하다.

        void instanceMethod() {   //객체생성후 호출이 가능하다.
            System.out.println(iv);
            System.out.println(cv);  클래스 변수를 ㅏ용이 가능함. 언제든지 사용 가능함
        }

        static void staticMethod() {   //static메서드   //객체 생성 없이 그냥 호출 가능
            System.out.println(iv);   //인스턴스 변수를 사용할 수 없다. static 메서드에서는 사용이 불가능하다.
            System.out.println(cv);   //클래스 변수는 사용하는 것이 가능하다. 언제 어디서든 사용 가능
        }
    }

    class TestClass {
       //static 메서드는 인스턴스 메서드를 호출하는 것이 불가능하다.
       void instanceMethod() {} //인스턴스메서드 호출방식
        static  void staticMethod() {}  //스태틱 메서드 호출방식

        void instanceMethod2() {   //인스턴스 메서드 선언하기
           instanceMethod();    //다른 인스턴스메서드를 호출하는 것이 가능하다.
           staticMethod();    //static메서드를 호출한다.
        }

        static void staticMethod2() {    //static메서드 : static메서드는 static메서드 호출이 가능하지만 인스턴스 변수 사용과 당연히 인스턴스 메서드 호출 역시 불가능하다.
           instanceMethod();    //에러 : 인스턴스메서드를 호출하는 것이 불가능하다.
           staticMethod();
        }
    }
}
