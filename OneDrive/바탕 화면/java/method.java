public class method {
    //메서드 : 문장들을 묶어놓은 것(작업단위로 문장들을 묶어서 이름 붙이는 것)
    //중복된 코드 제거가 쉬움 반복적으로 수행되는 여러 문장을 메서드로 작성하는 것이 좋다.
    //하나의 메서드는 한 가지 기능만 수행하도록 작성한다.
    //메서드 = 선언부 + 구현부
    //반환타입 메서드 이름(타입 변수명, 타입 변수명...){   ==선언부
    //    메서드 호출시 수행될 코드     == 구현부
    // }

    public static void main(String[] args) {
        int add(int a, int b){
            int result = a+b;
            return result;
            //호출한 메서드로 결과를 반환한다.
        }
    }
    //메서드 생성하고 사용해보기
    class Ex6_4 {
        public static void main(String[] args) {
            //MyMath 객체 생성해주기 = 사용을 해줄 객체 안에 Method를 담는다.

            MyMath mm = new MyMath();
            long result = mm.max(5,3);
            long result1 = mm.add(5L, 3L);  //add 메서드 호출해주기
            long result2 = mm.substract(5L, 3L);
            long result3 = mm.multiply(5L ,3L);
            double result4 = mm.divide(5L,3L);

            System.out.println("add(5L, 3L) = " + result1);
            System.out.println("subtract(5L, 3L)="+ result2);



        }

        class MyMath{
            //1. MyMath class 생성해주기(메서드를 만들어주기 = 1.어떤 기능을 수행하도록 할 것인가)
            long add(long a, long b){
                long result = a+b;
                return result;

            }
            long substract(long a, long b) {
                long result = a-b;
                return result;
            }
            long multiply(long a, long b) {
                long result = a*b;
                return result;


            }
            double divide(double a, double b){
                double result = a/b;
                return result;
            }

            long max(long a , long b){
                long reuslt = 0;
                if(a>b){
                    result = a;
                }
                else{
                    result = b;
                }
            }
        }
    }
}
