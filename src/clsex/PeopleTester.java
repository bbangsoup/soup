package clsex;

public class PeopleTester {

    public static void changePigName(Pig pig, String name){ // Pig pig = p1;
        pig.setName(name);
    }


    public static void main(String[] args) {

        // Animal ani = new Animal(); //추상 클래스를 이용하여 인스턴스를 직접 생성할 수 없다.

        // People p1 = new People();   // 바로 err

        Cat c1 = new Cat("뚱뚱이");
        //Cat c2 = new Cat(c1.getName()); // 하나의 객체를 이용해서 다른 객체를 복사 : 깊은 복사(Deep copy)


        c1.setName("검둥이");  // c1 인스턴스의 이름을 변경해도 c2의 이름이 변경되지 않는다.
        // c2는 객체를 하나 만든거였음요...
        // 그래서 c1 이름이 바뀌어도 c2는 다른객체라서 영향 안받음..
        // = 오른쪽 은 생성자인데
        // = 왼쪽의 실제 객체를 참조하는 거였다?
        // referenced type ..... 좀 더 용어 정리가 필요.

        Cat c3 = c1;    // 얕은 복사
        //c3.setName("흰둥이");  // c1의 이름도 달라짐;
        
        Dog d1 = new Dog("뿡뿡이");
        Pig p1 = new Pig("홀쭉이");

        // c언어의 포인터와의 개념 비교
        
        // 아래 두개의 코드의 차이점을 명확하게 이해해야 한다.
        changePigName(p1, "얼룩이");
        System.out.println( p1 );

        changePigName(new Pig("말랑이"), "점백이");
        System.out.println( p1 );

//        System.out.println( c1 ); // 뚱뚱이 -> 검둥이 -> 흰둥이
//        System.out.println( c2 );
//        System.out.println( c3 );
//        System.out.println( d1 ); // 뿡뿡이
//        System.out.println( p1 ); // 홀쭉이
//
//        // 이 둘의 차이점은?
        Object [] arrObj = { c1, d1, p1 };
        Animal [] arrAni = { c1, d1, p1 };

        for(Animal obj : arrAni) {
            obj.cry();
        }

        Animal c2 = new Cat("호랑이");
        Animal p2 = new Pig("날씬이");
        Animal d2 = new Dog("발발이");

        Dog d3 = (Dog)d2;   // 다형성을 이용한 형변환 허용
        d3.setBirth(10);

        ((Dog)d2).setBirth(20); // 다형성을 이용한 형변환 허용

        // 결국 부모클래스에서 자식클래스의 메소드를 사용하기 위해서 쓰는 기법?

        // 주의 : 코드상에서는 컴파일 에러가 발생하지 않지만
        // 반드시 런타임에러(Exception)를 발생시킨다.
        d3 = (Dog)p2;   // p2가 Dog 클래스가 아닌데...
        d3.setBirth(10);


//       People [] myArr = new People[3]; // 배열을 만드는 것이이 인스턴스를 만드는 것이 아니다.
//
//
//        myArr[0] = new American();
//        myArr[1] = new Korean();
//        myArr[2] = new Japanese();
//
//        for(Object obj : myArr){
//            People p = (People) obj;
//            p.say();
//        }

//        American p1 = new American();
//        Korean p2 = new Korean();
//        Japanese p3 = new Japanese();

//        p1.say();
//        p2.say();
//        p3.say();

        // static 하기 전
        Calculator calc = new Calculator();
        calc.add(1,2);

        // static 한 후
        Calculator.add(1,2);
        System.out.println();


        }

}

