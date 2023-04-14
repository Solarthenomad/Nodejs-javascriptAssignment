import java.util.Arrays;
//잘 이해가 안되는데...다시 한 번해보는 것도 좋을 것 같음
//숫자 섞기 = math.random
public class print_list_ex2 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));
        //0~9까지 숫자들을 출력할 수 있다.

        for (int i = 0; i < 100; i++) {  //100번 두 요소값을 바꾸기를 한다. 그리고 아래의 세개 문장을 100번 반복한다는 것 즉 이 for문은 100번 섞는 것을 의미한다.
            int n = (int)(Math.random() * 10);   //random함수를 사용한 다음 0~9ㄲ 중의 한 값을 임의로 뽑아서 n안에 넣는 것이 가능하다. 아 근데 이부분이 겁나 이해가 안됨...
            int tmp = numArr[0];   //임의의 변수를 설정하고 변수의 값을 선언하고 초기화를 할 때는 항상 배열의 맨 처음 값을 넣어준다.
            numArr[0] = numArr[n];  //배열을 섞기 위해서는 두 수를 바꾸면 된다. numArr[0] = numArr[n]은 0번째와 n번째의 자리  즉 순서를 바꾸는 것이다.
            numArr[n] = tmp;
            //int tmp = numArr[0];에서 tmp라는 값을 설정한 뒤 이것에 numArr이라는 배열의 첫번째 요소를 넣어주고
            //numArr[0] = numArr[n];  //비어버린 numArr의 첫 번째 요소에 n번째 요소 값을 넣어준다.
            //numArr[n] = tmp;    //그렇게 되면 n번쨰가 비게 되니까 아까 0번째 넣어준 값인 tmp를 numArr[n]에 넣어주게 된다.

        }




        System.out.println(Arrays.toString(numArr));
        //main 문 반복

    }


    class Ex_2_1{
        public static void main(String[] args) {
            int[] numArr = {0,1,2,3,4,5,6,7,8,9};
            System.out.println(Arrays.toString(numArr));

            for (int i = 0; i < numArr.length; i++) {
                int n = (int)(Math.random()*10);
                int tmp = numArr[i];
                numArr[i] = numArr[n];
                numArr[n] = tmp;
                System.out.println(Arrays.toString(numArr));

            }
        }
    }

    //로또 공 뽑기
    //6개의 임의의 공을 뽑고 싶음
    class ex_2_2{
        public static void main(String[] args) {

            //인덱스 번호 : 0~44까지이고 정수 0~44까지가 자동으로 배열안에 포함되게 된다.
            int[] ball = new int[45];
            //45개의 정수값들을 자동으로  생성해서 배열 ball에 넣어주기
            System.out.println(Arrays.toString(ball));

            //배열의 각 요소에 1~45의 값ㅇ르 저장한다.
            for (int i = 0; i < ball.length; i++) {
                ball[i] = i+1;  //ball[0]에 1이 저장됨
            }
            int tmp = 0; //두 값을 바꾸는데 사용할 임시 변수
            int j = 0;  //임의의 값을 얻어서 저장할 변수

            //배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을
            //0번째부터 5번째 요소까지 모두 6개만 바꾼다.

            for (int i = 0; i < 6; i++) {
                j = (int)(Math.random()*45);
                tmp = ball[i];
                ball[i] = ball[j];
                ball[j] = tmp;
                System.out.println(Arrays.toString(ball[j]));

            }

        }
    }
}
