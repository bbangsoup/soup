package cls;

public class MyUnitTest {
    public static void main(String[] args) {

        Marine m1 = new Marine("Marine",200, 10);
        MyUnit t1 = new MyUnit("Tank",300, 35);


        // Object : 모든 클래스들중에서 최상위 클래스

//        System.out.println("m1은 Marine의 인스턴스인가 : " + (m1 instanceof Marine) ); // (인스턴스 instanceof 클래스)
//        System.out.println("m1은 MyUnit의 인스턴스인가 : " + (m1 instanceof MyUnit) );
//        System.out.println("m1은 Object의 인스턴스인가 : " + (m1 instanceof Object) );
//        System.out.println("m1은 Marine의 인스턴스인가 : " + (t1 instanceof Marine) );

        System.out.println( t1 );   // cls.MyUnit@7699a589 <--- toString 재정의 하기 전, 콘솔에서 나오는 출력
        // [Tank] hp:300, power:35    <--- 나오게 재정의 해 볼것.


//        m1.steampack();
//        m1.attack(t1);
//        m1.info();
//        t1.info();


        // t1.steampack(); // 일종의 실수, 논리적인 오류, Tank는 스팀팩이 없어야 하는데.
                           // 자식 클래스를 안만들고 메소드를 만들면 Tank도 스팀팩이 생겨버림.


        MyStack st1 = new MyStack();    // 5칸짜리 스택
        MyStack st2 = new MyStack(10);

        st1.add(100);
        st1.add(200);
        st1.add(300);
        st1.add(400);
        st1.add(500);
        st1.add(600);
        st1.add(700);

        System.out.println( st1 );  // [100, 200, 300, 400, 500]

//        int num = 0;
//        num = st1.pop();
//        System.out.println( num );
//
//        num = st1.pop();
//        System.out.println( num );
//
//        num = st1.pop();
//        System.out.println( num );
//
//        num = st1.pop();
//        System.out.println( num );
//
//        num = st1.pop();
//        System.out.println( num );
//
//        num = st1.pop();
//        System.out.println( num );

    }
}
