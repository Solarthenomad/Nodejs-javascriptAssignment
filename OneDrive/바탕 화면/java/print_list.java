import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;   //Array를 사용할 수 있도록 만들어주는 모듈
//ctrl+shift + o를 눌러주면 출력된다.

import java.util.Arrays;

public class print_list {

    public static void main(String[] args) {
        char[] charArr = {'a', 'b', 'c', 'd'};
        System.out.println(charArr);  //abcd가 그대로 출력된다. 뛰어쓰기 없이 그냥 출력됨

        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
            //이렇게 for문으로 출력하면 배열의 요소들이 하나씩하나씩 출력된다.

        int[] iArr = {1,2,3,4};
            for (int j = 0; j < iArr.length; j++) {
                System.out.println(iArr[j]);

            }
            System.out.println(Arrays.toString(iArr));
            //iArr의 모든 요소들을 문자열로 바꿔줘서 출력한다. toString이 정수형을 문자열로 바꿔서 출력해주는데 출력해준 것이 [1,2,3,4,5] 이런 형태로 출력됨


        }
    }
}
