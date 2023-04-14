public class 객체지향언어2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");

        t1.channel = 7; //channel 값을 7로 한다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");
        t2 = t1; //참조변수 t1의 값을 t2에 저장한다.
        //=t2가 가르키는 객체 값이 t1의 값이됨
        //따라서 t2.channel = 7이 된다.

        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");
    }


}
