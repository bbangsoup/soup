package clsex;

// 추상클래스(abstract class)
public abstract class Animal {

    private String name;

    // 생성자(Constructor)
    public Animal(String name){
        this.name = name;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    // getter
    public String getName(){
        return this.name;
    }

    // 추상메소드
    public abstract void cry();

    @Override
    public String toString() {
        return name;
    }
}


