package pattern.adapter.objectadapter;

import pattern.adapter.classadapter.Source;
import pattern.adapter.classadapter.Targetable;

/**
 * @Author linfei
 * @Date 2019/3/28 9:09
 * @Description 对象适配模式  通过类的注入   private Source source;
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
