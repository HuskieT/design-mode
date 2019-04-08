package pattern.singlecase;

/**
 * @Author linfei
 * @Date 2019/3/27 16:03
 * @Description 饿汉模式 单例
 */
public class Single1 {

    public static final Single1 single1 = new Single1();


    public void show(){
        System.out.println("饿汉模式 单例");

    }

}
