package pattern.singlecase;

/**
 * @Author linfei
 * @Date 2019/3/27 17:25
 * @Description 静态内部类
 */
public class Single4 {

    public void show() {
        System.out.println("静态内部类 单例");
    }

    public Single4() {
        System.out.println("静态内部类  创建Single4");
    }

    public static class SingleInstanc{
        private  static final Single4 single4 = new Single4();

        public static Single4 getInstance(){
            return SingleInstanc.single4;
        }
    }


}
