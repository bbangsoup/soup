package basic;

public class PrintMatrix {
    public static void main(String[] args) {

        // 3,6,9 게임
        for (int i=1; i<=100; i++)
        {
            int sib = i / 10;
            int il = i % 10;
            /*
            int count = 0;      // 뭔가를 추가로 더 따져야 할때.. // for 돌때마다 0으로 초기화


            if (sib == 3 || sib == 6 || sib == 9)
            {
                System.out.print("짝");
                count++;
            }
            if (il == 3 || il == 6 || il == 9)
            {
                System.out.print("짝");
                count++;
            }
            if (count == 0)
                System.out.print(i);

            System.out.printf("\t");

            if (i%10 == 0)
                System.out.println();
            */

            String str = "";

            if(sib%3==0 && sib !=0)
                str = "짝";
            if(il%3==0 && il!=0)
                str += "짝";
            if(str.isEmpty())       // str이 빈 문자열 이면 true를 반환한다.
                System.out.printf("%d\t", i);
            else
                System.out.printf("%s\t", str);
            if (i%10 == 0)
                System.out.println();
        }
    }
}
