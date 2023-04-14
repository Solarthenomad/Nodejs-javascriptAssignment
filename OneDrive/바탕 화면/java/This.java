public class This {

    class Car2 {
        String color ;   //색상
        String gearType;  //변속기 종류
        int door;   //문의 개수

        Car2() {
            this("white", "auto", 4);
        }
        Car2(String color) {
            this(color , "auto", 4);
            //this는 Car2의 3개인 String color, String gearType, int door을 호출해준다.
        }

        Car2(String color, String gearType, int door) {
            this.color =color;
            this.gearType = gearType;
            this.door = door;
        }
    }

    //this()는 생성자에서 다른 생성자 호출할 때 사용해준다.
    //다른 생성자 호출 시 첫 줄에서만 사용이 가능하다. 중복해서 사용할 필요 없게 해준다.

    class Car {
        String color;
        String gearType;
        int door;

       //참조변수 this
        //인스턴스 자신을 가리키는 참조변수로 생성자 this()랑 다른 거임
        //인스턴스 메서드, 생성자에서 사용이 가능하다.
        //지역변수와 인스턴스 변수를 구별할 때 사용한다.

        this.color = color;   //위의 color을 이 참조변수의 color에 넣어준다.
        this.gearType = gearType;
        this.door = door;
    }

    //this() = 생성자, this(매개변수) : 생성자. 같은 클래스의 다른 생성자를 호출할 때 사용한다.

}
