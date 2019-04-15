package pattern.creational.factory.part3;

/**
 * @Author linfei
 * @Date 2019/3/26 16:14
 * @Description
 */
public class IphoneX extends ApplePhone {

    private  static  IphoneX iphoneX;

    static {
        iphoneX = new IphoneX();
    }
    public void show() {
        System.out.println("IphoneX 手机  装逼必备");
    }

    public IphoneX newInstance() {
        return iphoneX;
    }
}
