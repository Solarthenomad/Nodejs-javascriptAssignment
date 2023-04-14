public class overriding {
    //오버라이딩 : 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
    //오버라이딩 메서드 : 덮어쓰는 것
    //오버라이딩은 선언부 정보를 변경불가능하고 구현부{}만 변경이 가능하다.

    class Point {   //2차원 좌표인 Point를 만들어줌
        int x;
        int y;

        String getLocation() {
            return "x : "+ x + "y :" + y;
        }
    }

    class Point3D extends  Point {      //Point3D는 Point를 상속받는 것
        int z;    //Point의 인스턴스인 x,y를 그대로 물려받은 다음에 z를 추가로 인스턴스를 생성해줌

        String getLocation() {   //오버라이딩
            return "x :" + x+ "y : " + y +"z : " +z;
        }
    }



