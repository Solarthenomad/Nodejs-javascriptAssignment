public class 포함 {

    //포함 : 클래스의 멤버로 참조변수를 선언하는 것
    class MyPoint {
        int x;
        int y;
    }

    //상속 예시
    //class Circle extends  MyPoint {
    //    int r;
    //}

    class Circle {
        MyPoint p = new MyPoint();
        int r;
    }


    public  class InheritanceTest {
        public static void main(String[] args) {
            Circle c = new Circle();
            c.p.x = 1;
            c.p.y = 2;
            c.r = 3;


        }
    }

}
