package basic;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
/*      // 사용자에게 단수를 입력받아서 해당 단수 구구단을 출력하는 코드를 작성하세요.

        System.out.print("단수를 입력하세요 >>> ");

        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();     // 정수 입력 받기
        int n = 1;

        while (n < 10)
        {
            System.out.printf("%d X %d = %d\n", dan, n, dan * n);
            n++;
        }

        sc.close();
 */

        // 사용자가 0을 입력할때까지 사용자로부터 단수를 입력받아서
        // 해당 단수를 출력하는 구구단 코드를 작성하세요
        // 단수를 입력하세요 >>> 3
        // 3 X 1 = 3
        // ...
        // 3 X 9 = 27
        //
        // 단수를 입력하세요 >>> 5
        // 5 X 1 = 5
        // ...
        // 5 X 9 = 45
        // 단수를 입력하세요 >>> 0
        // 프로그램이 종료되었습니다.

        Scanner sc2 = new Scanner(System.in);
        int dan2 = 1;
        while( true )
        {
            System.out.print("단수를 입력하세요 >>> ");
            dan2 = sc2.nextInt();
            if (dan2 == 0 ) break;

            int n2 = 1;
            while (n2 < 10)
            {
                System.out.printf("%d X %d = %d\n", dan2, n2, dan2 * n2);
                n2++;
            }
        }
        System.out.println("프로그램 종료됨");
        sc2.close();
    }
}
