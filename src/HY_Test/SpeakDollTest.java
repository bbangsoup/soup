package HY_Test;

public class SpeakDollTest {
    public static void main(String[] args) {


    SpeakDoll sd1 = new SpeakDoll();
//    String m = sd1.getMessage();
//        System.out.println("인형 왈 : " + m);

        System.out.println( sd1 );

        sd1.setMassage("객체지향 어렵쥬?");

        System.out.println( sd1 );

        SpeakDoll sd2 = new SpeakDoll();
        sd2.setMassage("난 두번째 객체야");

        System.out.println( sd2 );


    }
}


