public class 선언위치변수종류 {

    public static void main(String[] args) {

        class Variables {
            int instanceVariable;  //클래스 영역에서 선언되는 것은 인스턴스 변수라고 부르고
            static int classVariable;   //클래스형 변수인데, 인스턴스 변수 앞에 static을 붙인 것을 클래스형 변수라고 한다.


            void method() {  //method를 만들 떄 void를 앞에 붙여준다.
                int localVariable;  //메서드 영역에서 생성되는 변수는 지역변수라고 한다.
            }

        }
    }
}
