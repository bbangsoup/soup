package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArrayExt {
    public static void main(String[] args) {



        // primitive type : byte, char, short, int, long, float, double, boolean
        // referenced type : String, class
        // Wrapper Class
        Byte a1 = 1;        // 매소드를 가지고 있는... a1. 했을때... 다름
        byte a = 1;
        // '객체'와 '변수'
        // Byte, Character, Short, Integer, Long, Float, Double, Boolean   <-- referenced type

        int num = a1.intValue();

        //Integer
        int [] arr = new int[10];

        Random rand = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i]=rand.nextInt(45)+1;
        }

//        for (int n : arr){
//            System.out.printf("%d\t",n);
//        }
        
        // Arrays.toString(arr) : arr 배열을 문자열로 변환
        System.out.println( Arrays.toString(arr) );     // 디버깅 용도

        /*
        // 오름차순
        Arrays.sort( arr );
        System.out.println( Arrays.toString(arr) );     // 디버깅 용도

        // 내림차순
        Arrays.sort( arr, Comparator.reverseOrder() );
        System.out.println( Arrays.toString(arr) );     // 디버깅 용도
        */

        // 탐색
        int val = rand.nextInt(45)+1;

        // val을 arr에서 찾아보고 몇번째 인덱스에 있는지 배열과 해당 인덱스값을 출력하는 코드를 작성하세요.
        // 찾았을때)
        // [배열 ... ]
        // val : xx 는 index : yy에 있습니다.
        // 못찾았을때)
        // [배열 ... ]
        // val : xx는 배열에 존재하지 않습니다.
        System.out.println();
        System.out.println( Arrays.toString(arr) );
        boolean find = false;   // 검색 성공여부 체크하는 플래그
        for (int i=0; i<arr.length; i++){
            if(val == arr[i]){
                System.out.printf("val : %d 는 index : %d 에 있습니다.\n", val, i);
                find = true;
                break;
            }
        }
        if (!find)
            System.out.printf("val : %d 는 배열에 존재하지 않습니다.\n", val);





        System.out.println();
        int temp;

        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){        // 오름차순
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            }
        }
        System.out.println( Arrays.toString(arr) );

        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){        // 내림차순
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println( Arrays.toString(arr) );

    }
}
