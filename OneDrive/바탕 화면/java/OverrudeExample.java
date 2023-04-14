class MyPoint3 {
    int x;
    int y;
    String getLocation( ){
        return "x :" + x +"y :" + y ;
    }
}
class MyPoint3D extends MyPoint3 {
    int z;   //인스턴스를 MyPoint3D에서 추가해서 받는다.
    //조상의 getLocation()을 보러아딩 해준다.
    String getLocation() {
        return "x :"+x+"y :" + y+"z :"+z;
    }

}

public class OverrideExample {
    public static void main(String[] args) {
        MyPoint3D p = new MyPoint3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());

    }
}
