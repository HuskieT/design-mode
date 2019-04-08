package pattern.observer;

/**
 * @Author linfei
 * @Date 2019/3/28 14:58
 * @Description
 */
public class Observer1 implements Observer {
    public void update() {
        System.out.println("Observer1 has received!");
    }
}
