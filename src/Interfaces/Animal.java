package Interfaces;

// GUI : Graphic User Interface
// CLI : Command Line Interface

// 자바에서 말하는 Interface..
// Interface : 개발자들간의 약속을 하기위한 아주 특별한 클래스
// 추상 메소드들로만 구성된 특별한 클래스 ==> 인터페이스(interface)

public interface Animal {

    public static final String name = "동물";     // 공개된 공통의 상수만 속성으로 갖을 수 있다!!!

    // final : 변경할 수 없는 상수


    public void cry();
    public void go();

}
