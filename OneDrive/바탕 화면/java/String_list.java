import java.util.Arrays;
//ctrl+shift+o라고 하면 자동으로 생성된다.

public class String_list {
    public static void main(String[] args) {
        String[] name = new String[3];
        //3rodml 문자열을 담을 수 있는 name 배열을 생성한다.
        //기본값 null들이 원소가 된다.
        name[0] = "Kim";
        name[1] = "Park";
        name[2] = "Yi";





    }

    class Ex5_1_tmp{

        public static void main(String[] args) {
            String[] strArr = {"가위", "바위", "보"};
            System.out.println(Arrays.toString((strArr)));

            //가위 바위 보 중 랜덤으로 하나가 나올 수 있도록 하기
            for (int i = 0; i < 10; i++) {
                //System.out.println((int)(Math.random()*3)); //0~2 중 하나가 나올 수 있도록 해야되는데 이렇게만 하면 숫자만 나옴 따라서 strArr[i]로 바꿔줄 피ㄹ요가 있음
                int tmp = (int)(Math.random()*3);
                System.out.println(strArr[tmp]); //0~2 인덱스에 해당되는 값들을 출력함




            }
        }
    }

    //String[] name = new String[]{"Kim", "Park", "Yi"};이라고 하면 문법적 오류가 생성됨
    //String[] name = {"Kim", "Park", "Yi"};라고 해야지 문법적 오류 생성 ㄴㄴ


}
