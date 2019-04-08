package pattern.adapter.classadapter;

/**
 * @Author linfei
 * @Date 2019/3/28 8:50
 * @Description  类的适配器模式
 */
public class Test {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();

    }

    /**
     * 核心思想： 有一个Source类 拥有一个方法，待适配 目标接口是 Targetable ，通过Adapter类
     * 将Source的功能扩展到Targetable中。
     *
     **/
}
