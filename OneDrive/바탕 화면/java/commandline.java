public class commandline {
    //커맨드 라인을 통해서 입력받기(커맨드 라인에 입력한 값이 문자열 배열에 담겨서 전달된다.)
    //alt + enter을 치면 현재 소스파일의 경로를 확인하는 것이 가능하다.

    public static void main(String[] args) {
        System.out.println("매개변수의 개수"+args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"] = \""+args[i]+ "\"");


        }

    }
}


