package cls;

public class MyUnitTest {
    public static void main(String[] args) {

        Marine m1 = new Marine("Marine",200, 10);
        MyUnit t1 = new MyUnit("Tank",300, 35);


        // Object : 모든 클래스들중에서 최상위 클래스

        System.out.println("m1은 Marine의 인스턴스인가 : " + (m1 instanceof Marine) ); // (인스턴스 instanceof 클래스)
        System.out.println("m1은 MyUnit의 인스턴스인가 : " + (m1 instanceof MyUnit) );
        System.out.println("m1은 Object의 인스턴스인가 : " + (m1 instanceof Object) );
        System.out.println("m1은 Marine의 인스턴스인가 : " + (t1 instanceof Marine) );

        m1.steampack();
        m1.attack(t1);
        m1.info();
        t1.info();


        // t1.steampack(); // 일종의 실수, 논리적인 오류, Tank는 스팀팩이 없어야 하는데.
                           // 자식 클래스를 안만들고 메소드를 만들면 Tank도 스팀팩이 생겨버림.

    }
}
