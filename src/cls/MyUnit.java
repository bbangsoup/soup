package cls;

// Marine : steampack   ((추가기능))
// Tank : 공격력 + 20, 체력 + 100  ((값이 다름))

// 필드(Field) : 클래스의 멤버 변수, 데이터 요소를 뜻한다.
// 메소드(method) : 멤버 함수
// 매개변수(Parameter, Argument, 인수, 인자): 메소드에서 외부로부터 주어지는 입력값으로 초기화되는 변수
// 매개변수가 정의되는 곳은 : 매소드([매개변수들...])

// 필드 : 정수형으로 hp, power

public class MyUnit {

    private int hp;
    private int power;
    private String name;

    // hp는 100, power는 100으로 설정하는 기본 생성자를 만드세요.
    public MyUnit(){
        hp = 100;
        power = 100;
        name = "이름없음";
    }

    // 외부로부터 hp와 power를 입력받아서 멤버 hp와 power를 설정하는 생성자
    public MyUnit(String name, int hp, int power){
        this.name = name;
        this.hp = hp;
        this.power = power;

    }

    // 외부에서 호출가능하도록
    // 반환값이 없는 메소드 damage 를 만드세요
    // 매개변수로 power 가 주어지고,
    // 멤버 변수 hp 를 매개변수 power 만큼 차감합니다.
    // hp 에서 power 를 차감한 값이 음수이면 0으로 처리합니다.
    public void damaged(int power){
        this.hp -= power;

        if (this.hp < 0)
            this.hp = 0;
    }

    public void attack(MyUnit target){
        target.damaged(this.power);     // target의 hp가 깎이는 형태? (m1의 power 가지고)
    }

    //***************************************************************************************
    // m1.attack(t1); // attack 메서드를 호출하는 주체는 m1 객체임.
    // 따라서 attack 메서드 안의 this.power 는 곧 m1 의 power 를 의미한다.
    // ***이해 중요***  ==> t1.damaged(m1.power); 이렇게 생각 할 수 있다.
    // 여기서 damaged를 호출하는 주체는 t1 이므로 damaged 함수안에서의 this.hp 는 t1의 hp를 의미한다.
    // 메서드 안에서의 this는 메서드를 호출한 객체를 의미한다.
    //***************************************************************************************
    // 공격자가 다른 유닛의 체력을 깍으려고 함
    // 공격자는 누구? m1
    // 공격받는 대상은 누구? t1 (체력감소는 누구?) -> 체력깍이는건 t1이 처리 -> t1.damaged(power);
    // 동작은 ? 공격자는 t1의 damaged 메소드를 호출하고, 자신의 power를 넘겨준다.
    // m1.attack(t1);
    //***************************************************************************************

    // hp와 power를 출력하는 메소드 info 를 만드세요
    public void info(){
        System.out.printf("[%s] hp : %d, power : %d\n", this.name, this.hp, this.power);
    }

    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){
        return power;
    }


}
