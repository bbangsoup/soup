package cls;

public class BankAccount {

    private int money;

    // 기본생성자 : 아무것도 없는 (생성자는 class 와 이름이 같아야 한다)
    public BankAccount(){
        money = 0;
    }

    public BankAccount(int money){
        this.money = money;

    }

    // 외부에서 접근 가능한 view 라는 메소드를 작성하세요.
    // 반환값 없음, 매개변수 없음
    // 외부에서 view를 호출하면 다음과 같은 결과가 출력되어야 합니다.
    // Balance : xxx 원
    public void view(){
        System.out.printf("Balance : %d원\n", money);
    }

    // 외부에서 접근 가능한 deposit 라는 메소드를 작성하세요
    // 반환값은 없음, 매개변수는 money 이고
    // 필드 money 의 값을 매개변수 money 의 값으로 누적시킵니다.
    // 실행결과
    // Deposit : xxx 원
    // Balance : xxx 원
    public void deposit(int money){
        this.money += money;
        System.out.printf("Deposit : %d원\n", money);
        view();
    }

}
