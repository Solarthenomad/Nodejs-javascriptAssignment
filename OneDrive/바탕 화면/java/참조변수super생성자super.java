public class 참조변수super생성자super {
    //참조 변수 super : 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자) 내에만 존재
    //조상의 멤버를 자신의 멤버와 구별할 때 사용한다.

    class Ex7_2 {
        public static void main(String[] args) {
            Child c = new Child();
            c.method();
        }
    }
    class Parent {int x = 10; /*super.x*/}

    class Child extends Parent {
        int x = 20;

        void method(){
            System.out.println("x=" +x);  //20
            System.out.println("this.x=" + this.x);   //20
            System.out.println("supr.x" + super.x);    //10
        }
    }

    class Ex7_3 {
        public static void main(String[] args) {
            Child2 c = new Child2();
            c.method();
        }
    }

    class Parent2 {int x = 10;}

    class Child2 extends Parent2 {
        void method() {
            System.out.println("x=" + x);   //10출력
            System.out.println("this.x=" + this.x);  //10출력
            System.out.println("super.x=" + super.x);   //10출력
        }

        //super() : 조상의 생성자를 호출할 때 사용하며 조상의 멤버는 조상의 생성자를 호출하여 초기화해준다. ???
        //생성자의 첫 줄에 반드시 다른 생성자를 호출해야 한다. 만약 그렇게 호출하지 않는다면 컴파일러가 생성자의 첫 줄에 super();(기본 생성자 호출하기)를 삽입해버린다.



    }
}
