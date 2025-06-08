package clsex;

public abstract class People {

    public People(){
        System.out.println("피플 생성자가 호출되었습니다.");
    }

    // 추상 메소드 ( abstract method)
    // 추상 메소드를 단 하나라도 가지고 있는 클래스를 추상 클래스라고 한다.
    public abstract void say();

    public void go(){
        System.out.println("사람이 갑니다");
    }

    
    
}
