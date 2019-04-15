package pattern.behavioral.decorate;

/**
 * @Author linfei
 * @Date 2019/3/28 11:52
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable obj = new Decorator(sourceable);
        obj.method();
    }
}
