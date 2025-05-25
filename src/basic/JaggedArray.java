package basic;

import java.util.Arrays;
import java.util.Random;

public class JaggedArray {
    public static void main(String[] args) {

        Random rand = new Random();

        // Jagged Array : 불규칙적인 가변길이 배열
        int [][] arr = new int [3][];                   // 1차원의 배열의 개수가 만들어지지 않음
        for (int i=0; i < arr.length; i++) {
            int len = rand.nextInt(10)+1;
            arr[i] = new int [len];     // '1차원 배열'을 만들어서 '2차원배열의 i 번째' 아이템에 할당을 하겠다~
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10)+1;
            }
            System.out.println(Arrays.toString( arr[i] ));

        }

        System.out.println();

        String [] strArr = {"hello", "world", "Java", "is", "good"};
        for (String str : strArr) {
            System.out.printf("%s ", str);
        }

        System.out.println();
        for(String arg : args) {
            System.out.printf("%s ", arg);
        }


    }
}
