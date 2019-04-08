package pattern.singlecase;

/**
 * @Author linfei
 * @Date 2019/3/27 16:10
 * @Description 双重检测
 */
public class Single3 {
    private static Single3 single3;

    public static Single3 getInstance() {
        if (single3 == null) {
            synchronized (Single3.class) {
                if (single3 == null) {
                    single3 = new Single3();
                    System.out.println(Thread.currentThread().getName());
                    return single3;
                }
            }
        }
        return single3;
    }
    public Single3() {
        System.out.println("双重检测 创建单例类");
    }




    public void show() {
        System.out.println("双重检测 单例");
    }
}
