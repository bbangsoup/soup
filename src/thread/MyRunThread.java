package thread;

// 스레드를 라이트하게 상속받지 않고 runnable로 구현한다.
// 이 방법이 많이 쓰이는 편이고 스레드를 상속받는것 보다 용량이 작게 만들 수 있다.
public class MyRunThread implements Runnable{
    private String name;

    public MyRunThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.printf("[%s] : %d\n", name, i);

            try {
                Thread.sleep(1); // 1초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
