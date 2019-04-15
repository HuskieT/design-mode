package pattern.creational.factory.part3;

/**
 * @Author linfei
 * @Date 2019/3/26 16:15
 * @Description
 */
public class P10 extends HuaWeiPhone {
    private  static  P10 p10;
    public void show() {
        System.out.println("华为p10！");
    }

    public P10 newInstance() {
        return p10;
    }
}
