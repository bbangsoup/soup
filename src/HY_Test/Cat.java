package HY_Test;

public class Cat {

    // Cat 객체 하나당 하나씩 존재함.
    String name;

    // 모든 Cat 객체가 공유하는 하나의 변수. Cat 객체가 몇개 만들어졌는지를 저장하기 위한 용도
    // 클래스가 로딩될때 딱 한 번만 생성됨.
    static int count = 0;


    public Cat(String name){
        this.name = name;
        count++;
    }

}