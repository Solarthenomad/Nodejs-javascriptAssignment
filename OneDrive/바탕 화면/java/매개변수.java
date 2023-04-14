public class 매개변수 {

    //기본형 매개변수 : 변수의 값을 읽기만 할 수 있다(read only)

    //기본형 매개변수 예시
    class Data{int x;}
    class Ex6_6{
        public static void main(String[] args) {
            Data d = new Data() ;
            d.x = 10;
            System.out.println("main() : x = " + d.x);

            change(d.x);
            System.out.println("After change(d.x)");
            System.out.println("main() : x = " + d.x);
            }

            static  void change(int x) {

            x= 1000;
                System.out.println("change() : x = " + x);

                //결과
                //main() : x= 10
                //change() : x =1000
                //After change(d.x)
                //main() : x= 10

        }
    }
    //참조형 매개변수 : 변수의 값을 읽고 + 변경하기까지가 가능하다(read + write)

    //예시
    class Data3 {int x;}
    class Ex6_8 {
        public static void main(String[] args) {
            Data3 d= new Data3();
            d.x = 10;

            Data3 d2 = copy(d);
            System.out.println("d.x=" + d.x);
            System.out.println("d2.x" + d2.x);
        }

        static Data3 copy(Data3 d) {
            Data3 tmp = new Data3();   //새로운 객체 tmp를 생성한다.
            tmp.x = d.x;//d.x의 값을 tmp.x에 복사한다.
            retrun tmp;  //복사한 객체의 주소를 반환한다.
        }
    }


}
