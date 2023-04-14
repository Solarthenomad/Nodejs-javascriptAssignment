public class overloading {
    //오버로딩 : 한 클래스 안에 같은이름의 메서드를 여러개 정의하는 것을 의미한다.
    //오버로딩이 성립하기 위한 조건 3가지
    //1. 메서드 이름이 다 같아야 한다.
    //2. 매개변수의 개수 또는 타입이 달라야 한다. float , object, int ,char 등으로 달라야한다.
    //3. 반환 타입은 영향이 없다.
    //ex int add(int a, int b) {return a+b;}   int add(int x, int y){return x+y;} 이 둘에 대해서는 오버로딩이 아니다.
    //ex int add(int a, int b) {return a+b;}    long add(int a, int b) {return (long)(a+b);} 이 둘에 대해서는 오버로딩이 아니다.
    //ex long add(int a, long b) {return a+b;}   long add(long a, int b){return a+b;}   //이 둘에 대해서는 오버로딩이 맞다. add(3,3)을 호출하면 저 두개의 메서드 호출 둘 중하나 아무거나 해도 가능하다. 다른 말로 알 수 없음. 그래서 디버거에 ambiguous가 뜨게 됨

    //예제

    class MyMath3 {
        int add(int a, int b) {
            System.out.println("int add(int a, int b)");
            return a+ b;

        }
        long add(long a, long b){
            System.out.println("long add(long a, long b)");
            return a+b;
        }

        int add(int[] a) {
            System.out.println("int add(int[] a) - ");
            int result = 0;
            for (int i = 0; i < a.length; i++) {
                result += a[i];

                return result;

            }
        }

    }





}
