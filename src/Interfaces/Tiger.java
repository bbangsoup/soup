package Interfaces;

public class Tiger implements Animal, Creature{



    // from Animal
    @Override
    public void cry() {
        System.out.println("어흥");
    }

    // from Animal
    @Override
    public void go() {

    }

    // from Creature
    @Override
    public void eat(String food) {

    }
}
