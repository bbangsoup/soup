package cls;

import java.util.Arrays;

public class MyStack {

    private int [] arr; // arr 은 그냥 배열 변수
    private int count;  // 배열의 길이(아이템의 개수)를 저장하는 속성
    private int position;

    public MyStack(){
        arr = new int [5];
        count = 5;
        position = 0;
    }

    // int count를 매개변수로 받는 추가 생성자를 만드세요.
    // arr 배열은 count 만큼의 길이를 갖도록 코드를 작성하세요.

    public MyStack(int count){
        arr = new int[count];    // 여기 {} 안에서 int [] arr =... 하게되면 여기 {} 안에서만 생성되었다가 나중에 사라지니까...
        // 필드 카운터를 매개변수 카운트로 설정
        this.count = count;
        this.position = 0;
    }

    // 외부에 값을 전달해 주는 멤버함수
    public int getCount(){
        return this.count;
    }


    // Stack 입구,출구가 같은 자료형 구조
    public void add(int value){
        if ( position > count-1){
            System.out.println("더이상 데이터를 추가 할 수 없습니다.");
            return;
        }
        arr [ position++ ] = value;   // arr의 position 위치에 value를 대입하고 position 1 증가시킴
    }

    // pop
    public int pop(){
        if ( position == 0){
            System.out.println("값을 가져올 수 없습니다.");
            return 0;       // return이 0 이라서 콘솔에 0이 찍힘;
        }
        return arr[ --position ];   // add() 로 position이 1 증가 되어 있는 상태이기 때문에, position 위치를 -1 해야 한다.
    }

    public String toString(){
        return Arrays.toString(arr);    // 배열 값
    }

    public int getPosition(){
        return position;
    }


}
