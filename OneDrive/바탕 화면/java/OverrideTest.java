class MyPoint3 extends Object {
   int x;
   int y;



    public  String toStirng() {
        return "x:" +x+"y:"+y;
        //object 클래스의 toString()을 오버라이딩하기
    }

}

public class OverrideTest {
    public static void main(String[] args) {
        MyPoint3 p = new MyPoint3(3,5);
        //p.x = 3;
        //p.y = 5;
        System.out.println("p.x="+p.x);
        System.out.println("p.y="+p.y);
    }
}

//오버라이딩의 조건
//1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
//예시
class Point {
    int x;
    int y;

    String getLocation() {
        return "x:" + x + "y:" + y;
    }
}

class Point3D extends Point {
    int z;

    String getLocation() {
        return "x :" + x + "y :" + y+"z:"+z;
    }
}

//2.접근 제어자를조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.


