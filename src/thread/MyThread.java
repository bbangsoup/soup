package thread;

import java.util.Timer;

// Thread : 병렬처리하게 한다.
public class MyThread extends Thread {
    public MyThread(String name) {
        super ( name );
    }

    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.printf("[%s] : %d\n", this.getName(), i);

            try {
                Thread.sleep(1); // 1초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
