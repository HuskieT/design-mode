package pattern.singlecase;

import java.util.concurrent.TimeUnit;

/**
 * @Author linfei
 * @Date 2019/3/27 16:38
 * @Description
 */
public class ThreadTwo implements  Runnable{

    public void run() {
        while (true){
            System.out.println("Two--->"+Single3.getInstance().hashCode()+Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
