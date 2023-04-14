//ch2-5 상수와 리터럴

public class 상수와리터럴 {

    int score = 100;
    int score = 200;  //score은 이미 define되서 변화가 불가능함

    final int MAX = 100;
    int MAX = 200; //이미 final로 최종값을 선언함

    char ch = 'a';
    String MIN = "ABM";

    public static void main(String[] args) {
        int score = 100;
        score=200;   // score바꾸기 가능 200이 출력됨
        //final int score = 100을 하면 절대 바뀌지 못함

        system.out.println(score);
    }

}
