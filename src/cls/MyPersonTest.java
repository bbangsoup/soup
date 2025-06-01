package cls;

import java.util.Random; // Random 이라는 클래스를 사용하기 위해 이 파일에 import 시킴

public class MyPersonTest {
    public static void main(String[] args) {

        Random rand = new Random();

        // primitive type : byte, char, short, int, long, float, double, boolean
        // referenced type : String...

        // Person : class
        // k1 : object(객체, 인스턴스(instance))
        // 클래스명 객체명 = new 생성자;  // 클래스 명 : referenced type
        Person k1 = new Person();   // Person 클래스로부터 k1 인스턴스가 생성되며, 생성자가 자동으로 호출된다.

        k1.increaseAge();
        k1.setGender("남성");
        k1.setGender("남자");
        k1.introduce();
        int k1_age = k1.getAge();
        System.out.println(k1_age);


        Student k2 = new Student("홍길동",18, "남자","하버드");
        k2.introduce(); // Person 클래스에 구현되어 있는 introduce 기능 + 추가 기능

        String str = new String("대한민국");
        System.out.println( str );

        System.out.println( k1 );   // 왜 위의 str 로 하는것과 다른가?
        System.out.println( k2 );   // -> Person.toString()메소드를 재정의하여 인스턴스를 문자열로 반환한다.



    }
}
