import java.util.Arrays;

public class String_class {
    //String class : char[]와 메서드(기능)을 결합한 것이다.
    //String 클래스 = char[] + 메서드(기능) 메서드는 문자열을 다루는데 필요한 기능들을 묶어놓은 것이다.
    //string 클래스는 내용을 변경할 수 없고 읽기만 가능하다.
    String str = "ABCDE";
    char ch = str.charAt(3);
    //문자열 str의 4번째 문자 'D'를 ch라는 문자형 변수 안에 저장한다.
    String str1 = "012345";
    String tmp = str.substring(1,4);   //substring은 배열의 부분적인 것들만 출력하는 것인데, 인덱스 1~4의 문자들을 반환하는 것을 의미한다.

    //tocharArray() : 문자열로 반환해주는 것
    System.out.println(tmp);

    class Ex5_1_tmp{
        public static void main(String[] args) {
            //    인덱스 : 01234
            String str = "ABCDE";
            char ch = str.charAt(2);
            System.out.println(ch);

            String str1 = str.substring(1,4);
            String str2 = str.substring(1);
            String str3 = str.substring(1,str.length());
            System.out.println(str1);
            System.out.println(str3);



        }
    }

}
