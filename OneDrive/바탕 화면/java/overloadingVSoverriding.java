public class overloadingVSoverriding {

    //오버로딩(overloading) : 기존에 없는 새로운 메서드를 정의하는 것= new method 생성
    //오버라이딩(overriding) : 상속받은 메서드의 내용을 변경하는 것 (change, modify)

    class Parent {
        void parentMethod() {}
    }

    class Child extends Parent {
        void parentMethod() {}   //오버라이딩
        void parentMethod(int i) {}  //오버로딩

        void childMethod() {}   //메서드 정의
        void childMethod(int i) {}    //오버로딩
        void childMethod() {}   //중복 정의 = 에러
    }
}
