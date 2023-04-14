import java.sql.Time;

public class constructor {

    //생성자(constructor) : 인스턴스가 생성될 때마다 호출되는 인스턴스 초기화 메서드
    class TimeStamp {
        public static void main(String[] args) {
            Time t = new Time();
            t.hour = 12;
            t.minute = 34;
            t.second = 56;
        }
    }

    //이렇게 하면 메서드를 참조해서 사용하는 것이 가능하지만,

    Time t = new Time(12,34,56);
    //생성자 호출 가능 

}

//생성자의 이름은 클래스의 이름과 같아야 한다.
//클래스 이름(타입 변수명, 타입 변수명, ...) {
// 인스턴스 생성 시 수행될 코드와 인스턴스 변수의 초기화 코드를 적어야 한다.

 class Data_1 {
    int value;
 }

 class Data_2 {
    int value;

    Data_2() {

    }

    Data_2(int x) {
        value = x;
    }
 }

 class Ex6_11 {
     public static void main(String[] args) {
         Data_1 d1 = new Data_1();
         Data_2 d2 = new Data_2();
     }
 }
//매개변수가 있는 생성자
 class Car {
    String color;   //색상
    String gearType;   //변속기 종류 - auto(자동), manual(수동)
    int door;   //문의 개수

    Car() {
    }
    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }



 }