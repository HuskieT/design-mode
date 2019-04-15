package pattern.creational.singlecase.old;

/**
 * @Author linfei
 * @Date 2019/3/27 16:06
 * @Description 懒汉模式 单例
 */
public class Single2 {
    public static  Single2 single2 ;
    static{
        single2 = new Single2();
    }

    public void show(){
        System.out.println("懒汉模式 单例");

    }

}
