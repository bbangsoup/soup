package basic;

import java.util.Scanner;

public class DoWhileStmt {
    public static void main(String[] args) {
       /* do ~ while
        
        do { 
            반복 실행될 명령문들...
        } while ( 조건식 );
       */
        Scanner sc = new Scanner(System.in);
        int dan = -1;
        do
        {
            System.out.print("단수를 입력하세요 >>> ");
            dan = sc.nextInt();
            if ( dan == 0 ) break;

            int n = 1;
            while ( n < 10 )
            {
                System.out.printf("%d X %d = %d\n", dan, n, dan * n);
                n++;
            }

        } while( true );

        System.out.println("프로그램 종료됨");
        sc.close();
    }
}
