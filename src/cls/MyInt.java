package cls;

//MyInt 라는 이름의 클래스를 만들고
//속성(필드)로 int n 을 완전 비공개 멤버로 정의하세요
//기본 생성자를 만들고 데이터 n을 0으로 초기화하세요
//추가 생성자를 만들고 매개변수 n을 받아서 속성 n을 매개변수 n으로 초기화 하세요

public class MyInt {

    private int n;

    public MyInt(){
        n = 0;
    }

    public MyInt(int n){
        this.n = n;
    }

    // 필드 n을 외부로부터 입력받아서 설정하는 setter 메소드를 정의하세요
    public void setN(int n){
        this.n = n;
    }

    // 필드 n을 외부로 제공하는 getter 메소드를 정의하세요
    public int getN(){
        return n;
    }

    @Override
    public String toString() {
        return String.format("%d",n);

    }

    @Override
    public boolean equals(Object obj) {
        // 우선 주체와 비교대상(obj)의 클래스가 동일한지 검사한다.
        if( !(obj instanceof MyInt) )
            return false;

        // 주체의 필드 n과 비교대상(obj)의 필드 n이 서로 동일한지 검사하고, 같은면 true, 다르면 false를 반환하도록 한다.
        MyInt target = (MyInt) obj;

        return this.n == target.n;

    }
}
