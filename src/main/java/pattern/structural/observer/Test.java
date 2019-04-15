package pattern.structural.observer;

/**
 * @Author linfei
 * @Date 2019/3/28 15:09
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
