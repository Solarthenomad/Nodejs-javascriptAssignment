import java.util.Arrays;

public class Arrays_list {

    //문자열 비교 : equals()
    //문자열로 변환해주기 : toString()

    public static void main(String[] args) {
        int [] arr= {0,1,2,3,4};
        int [][] arr2D = {{11,12}, {21,22}};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //arr안의 원소들을 순서대로(오름차순)으로 배치시켜줌


        System.out.println(Arrays.toString(arr));
        //[0,1,2,3,4]가 출력된다. toString은 1차원 배열만 출력
        System.out.println(Arrays.deepToString(arr2D));
        //[[11,12], [21,22]]가 출력된다. deepTostring은 2차원 이상 배열부터만 출력해줌

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));  //false가 출력됨. equals는
        System.out.println(Arrays.deepEquals(str2D, str2D2));  //True가 출력됨.
    }

    //배열의 복사 : copyOf(), copyOfRange()

    int[] arr= {0,1,2,3,4};
    int[] arr2 = Arrays.copyOf(arr,arr.length);  //복사할 요소들의 개수
    int[] arr3 = Arrays.copyOf(arr,3); //arr3 = [0,1,2]를 출력해준다.
    int[] arr4 = Arrays.copyOf(arr,7); //arr4=[0,1,2,3,4,0,0]을 출력해준다.
    int[] arr5 = Arrays.copyOfRange(arr,2,4);
    //arr5= [2,3] 인덱스2부터 4전까지출력해준다.
    int[] arr6= Arrays.copyOfRange(arr, 0, 7);
    //arr6= [0,1,2,3,4,0,0]을 출력해준다.

    //배열의 정렬 : sort()

    class sort{

        public static void main(String[] args) {
            int[] arr = {0,1,2,3,4}; //1차원 배열 arr
            int[][] arr2D = {{11,12}, {21,22}}; //2차원 배열인 arr2D

            String[][] str2D = {{"aaa","bbb"}, {"AAA", "BBB"}};
            String[][] str2D2 = {{"aaa","bbb"}, {"AAA", "BBB"}};


            System.out.println(Arrays.toString(arr));   //[0,1,2,3,4]가 출력됨
            System.out.println(Arrays.toString(arr2D));  //[[11,12], [21,22]]가 출력됨
            System.out.println(str2D == str2D2);
            //참조 변수 값 비교 이고 false가 나온다. 이 둘은 변수 자체가 애초에 다른거임 -> 메모리 위치도 다르기 때문에 false 출력
            //변수 '값'이 같은지 비교하고 싶다면,
            System.out.println(Arrays.deepEquals(str2D,str2D2));

            //배열복사하기
            int[] arr2 = Arrays.copyOf(arr, arr.length);  //이것을 arr2라는 변수 안에 넣어준다.
            System.out.println(Arrays.toString(arr2));




        }

    }

}
