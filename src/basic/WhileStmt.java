package basic;

import java.util.Scanner;

public class WhileStmt {
    public static void main(String[] args) {

        // 반복문
        // while, do ~ while, for ==> enhanced for, map, ...

        // while ( 조건식){
             //조건식이 참인동안 반복 실행될 명령문들...

/*
        int n=0;
        while (n<10){
            System.out.println((n++));
        }

        System.out.println("while문이 종료됨");

        n =0;
        while ( true ){
            System.out.println(n++);
            if ( n > 10) break;     // break문을 이용하여 현재 반복문을 탈출할 수 있다.
        }


        // Scanner 를 이용하여 정수를 입력받고
        // 해당 정수까지 반복수행하면서 현재 값을 출력하는 반복문을 구현하세요
        n=1;
        int number = 0;

        Scanner sc=  new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        number = sc.nextInt();



        while (n <= number) {
            System.out.println((n++));
        }
        sc.close();


        // 1부터 10까지의 합을 구하는 코드를 작성하세요
        // 출력형식)
        // 1부터 10까지의 합 : 55
        

        int num = 0;
        int sum = 0;        // 누적변수 클리어
        while (num <= 10)
        {
            sum += num;
            num++;
        }

        System.out.printf("1부터 10까지의 합 : %d\n", sum);
*/

        // 사용자가 0을 입력할때까지 숫자를 입력받고, 해당 숫자를 출력하기
        // 출력형식)
        // 숫자를 입력하세요 >>> 1
        // 1
        // 숫자를 입력하세요 >>> 2
        // 2
        // 숫자를 입력하세요 >>> 0
        // while문이 종료됨
/*
        int input = 0;

        Scanner abc=  new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 >>> ");
            input = abc.nextInt();
            if(input==0) break;

            System.out.println(input);
        }
        abc.close();
*/

        // 구구단 3단을 출력하는 코드를 작성하세요
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 3 X 9 = 27
/*        int n = 1;
        while (n <= 9) {
            System.out.printf("3 X %d = %d\n", n, 3*n);
            n++;
        }
*/

        // 숫자 맞히기 게임 (1~10 사이 무작위 숫자)





        System.out.println("while문이 종료됨");

    }
}
