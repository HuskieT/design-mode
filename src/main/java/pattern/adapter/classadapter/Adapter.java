package pattern.adapter.classadapter;

/**
 * @Author linfei
 * @Date 2019/3/28 8:48
 * @Description
 */
public class Adapter extends Source implements Targetable {

    public void method2() {
        System.out.println("this is targetable method");
    }
}
