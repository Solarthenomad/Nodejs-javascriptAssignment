public class 배열 {

    //배열 : "같은 타입"의 변수를 하나의 묶음으로 선언해줌
    //배열 : 참조 변수(참조 변수를 통해서 인덱스(저장공간)을 다룸 ), 인덱스(순서)

    //배열 선언방법
    //1. 타임[] 변수이름  예시 : int[] score;   string[] name;
    //2. 타입 변수이름[]  예시 : int score[];   string name[];

    int[] score = new int[5];   //길이가 5인 int 배열을 생성한다.(선언한다. = new)
    //배열의 이름은 여기서 score이고 각 인덱스를 부여한 원소들은 score[0] score[1]이런 식으로 된다.

    int value = score[3];    //배열 score의 4번 째 요소의 값을 읽어서 value라는 변수 안에 저장한다.
    //value와 score 변수는 서로 무관한 존재



}

class Ext_1_tmp {
    public static void  main(String[] args){
        int[] score;  //배열 score을 선언한다.(참조 변수)
        score = new int[5];   //int 타입 배열 안의 인덱스 5개를 만든다.

        score[3] =100;   //score의 4번째 인덱스에 100이라는 값을 넣는다.
        System.out.println("score[0]="+score[0]);
        System.out.println("score[3]"+score[3]);

        int value = score[3];
        System.out.println("value=" +value);

        int[] arr = new int[5]; //길이가 5인 정수 변수들을 갖는 arr 변수를 선언한다.
        int tmp = arr.length;   //arr.lentgh의 값은 5이고 이것을 tmp라는 변수에 5라는 값을 저장한다.

        //배열은 한 번 생성하면 그 길이를 실행하는 동안 바꿀 수 없다.

        for(int i=0; i < 6; i++){
            System.out.println(score[i]);
        }

        int[] score = new int[5];    //배열을
        for(int i; i<score.length; i++) {
            System.out.println(score[i]);
        }





    }

    class Ex5_2_tmp {
        public static void main(String[] args) {
            //index 범위 : 0~9
            int[] arr= new int[10]; //길이가 10인 arr배열을 만들어줬음
            System.out.println("arr.length="+ arr.length);

            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr["+i+"]="+arr[i]);

            }

        }
    }

    //배열의 초기화 : 배열의 각 요소에 처음으로 값을 저장한느 것

    }
    class Ex5_3_tmp{

        public static void main(String[] args) {
            int[] arr= {1,2,3,4,5};   //배열을 선언해주고 바로 값 넣기
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr["+i+"]="+arr[i]);

            }
        }
    }
}

