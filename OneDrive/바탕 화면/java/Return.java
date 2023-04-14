public class Return {

    public static void main(String[] args) {

        //return; : 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다

        class MyMath {
            void printGugudan(int dan){
                for (int i = 0; i < =9; i++) {
                    System.out.println("%d * %d = %d%n", dan, i, dan*i);

                }

            }

            long add(long a , long b){
                long result = a+b;
                return  result;
            }
        }

    }
}
