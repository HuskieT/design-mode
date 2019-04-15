package pattern.behavioral.decorate;

/**
 * @Author linfei
 * @Date 2019/3/28 11:50
 * @Description
 */
public class Decorator implements Sourceable {

    private  Sourceable source ;

    /** Decorator 装饰对象 Sourceable 被装饰对象**/

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    public void method() {
        System.out.println("before Decorator");
        source.method();
        System.out.println("after Decorator");
    }
}
