package pattern.observer;

/**
 * @Author linfei
 * @Date 2019/3/28 15:04
 * @Description
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println(" update self ");
        notifyObservers();
    }
}
