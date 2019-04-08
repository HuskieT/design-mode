package pattern.observer;

/**
 * @Author linfei
 * @Date 2019/3/28 15:00
 * @Description
 */
public interface Subject {
    //添加观察者
    void add (Observer observer);
    //删除观察者
    void del(Observer observer);
    //通知所有观察者
    void notifyObservers();
    //自身的操作
    void operation();
}
