package basic;

public class ForStmt {
    public static void main(String[] args) {

        // for 반복문
        // for(초기식; 조건식; 증감식)

        for(int dan = 2; dan < 10; dan++)
        {
            System.out.printf("--- %d 단 ---\n", dan);
            for (int i = 1; i < 10; i++)
            {
                System.out.printf("%d X %d = %d\n", dan, i, dan * i);
            }
            System.out.println();   // 줄 바꿈
        }

    }
}
