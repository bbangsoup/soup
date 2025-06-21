package Interfaces;

public class
Outer {
    public String name;
    public Outer(){
        name = "외부 클래스";
    }

    // Animal ani : 인터페이스.. 매개변수로 Animal type으로 받았다
    public void animalCry(Animal ani) {
        ani.cry();
    }

    public void animalGo(Creature ani) {
        ani.eat("고기");
    }


    public class Inner {
        public String name;
        public Inner(){
            name = "내부 클래스";
        }
    }


}
