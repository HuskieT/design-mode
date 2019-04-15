package pattern.creational.singlecase.old;

/**
 * @Author linfei
 * @Date 2019/3/27 16:37
 * @Description
 */
public class ThreadOne implements Runnable {

    public void run() {
        while (true){
            System.out.println("One--->"+Single3.getInstance().hashCode()+Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
