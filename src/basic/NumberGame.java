package basic;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        // 숫자 맞히기 게임 (1~10 사이 무작위 숫자)

        Random rand = new Random();
        int num = rand.nextInt(10)+1;       // 1 ~ 10 까지 랜덤 생성
       System.out.printf("출력 %d\n",num);

        Scanner sc=  new Scanner(System.in);

        int input = 0 ;
        while (input != num)
        {
            System.out.print("숫자를 입력하세요 >>> ");
            input = sc.nextInt();

            if(input<num)
                System.out.print("입력하신 숫자는 작습니다.\n");
            else
                System.out.print("입력하신 숫자는 큽니다.\n");
        //    if(input==num)  break;
        }
        System.out.print("정답입니다.");
        sc.close();
    }
}
