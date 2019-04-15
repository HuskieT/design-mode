package pattern.behavioral.adapter.objectadapter;

import pattern.behavioral.adapter.classadapter.Source;
import pattern.behavioral.adapter.classadapter.Targetable;

/**
 * @Author linfei
 * @Date 2019/3/28 9:08
 * @Description
 */
public class Wrapper implements Targetable {
    private Source source;
    public void method1() {

    }

    public void method2() {

    }

    public Wrapper(Source source) {
        this.source = source;
    }
}
