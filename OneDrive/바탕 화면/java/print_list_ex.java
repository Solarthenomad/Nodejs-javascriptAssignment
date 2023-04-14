import java.util.Arrays;

public class print_list_ex {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3= {100, 95, 70, 80, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i+1;  //1~10사이의 숫자들을 순서대로 배열에 다시 넣어준다.
            //Arr[0] = 1 Arr[1] = 2 이런식으로 넣어줌...!!
            //1,2,3,4,5,6,7,8,9,10 을 출력해주게 된다.

        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10)+1;
            //1~10사이의 random값이 출력된다.

        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.println(iArr1[i]+",");

        }

        System.out.println(Arrays.toString((iArr2)));  //우리에게 익숙한 숫자배열을 출력해줌
        System.out.println(Arrays.toString((iArr3)));
        System.out.println(Arrays.toString((chArr)));
        System.out.println(iArr1);   //메모리 위치를 출력해준다.
        System.out.println(iArr2);
        System.out.println(iArr3);
        System.out.println(chArr); //abcd를 출력해준다.



    }

    class Ex5_3 {

        public static void main(String[] args) {
            int sum=0;
            float average = 0f;

            int[] score = {100,90,80,70,100};

            sum += score[0];
            sum += score[1];
            sum += score[2];
            sum += score[3];
            sum += score[4];


            for (int i = 0; i < score.length; i++) {
                sum += score[i];

            }
            average = sum/ (float)score.length; //계산결과를 float로 얻어야됨.
            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + average);

        }
    }
    
    //배열의 최대값과 최소값 찾기 예제 
    
    class Ex5_4{
        public static void main(String[] args) {
        
            int[] score = {79,88,91,33, 100,55,95};
            
            //배열의 첫번째 값을 임시로 넣어주자 변동가능
            int min= score[0];
            int max=score[0];

            for (int i = 0; i < score.length; i++) {
                if(score[i] >max){
                    max = score[i];

                }
                else if(score[i] < min) {
                    min = score[i];

                }
                
            }
        }
    }
}
