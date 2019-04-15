package pattern.behavioral.adapter.interfaceadapter;

/**
 * @Author linfei
 * @Date 2019/3/28 11:04
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();

        //SourceSub1*******method1*
        sourceable1.method1();
        //实际调用的是Wrapper的method2 方法；Wrapper的method2没有抽象的所以没有输出
        sourceable1.method2();


        sourceable2.method1();
        //SourceSub1********method2
        sourceable2.method2();

    }
    /**
     * 接口的适配器很常见
     * 有时我们写一个接口 他有多个抽象方法，但我们的类实现接口时不需要那么多方法，此时
     * 我们用一个抽象类实现接口，然后 让其他类继承这个抽象类，就可以解决问题
     *
     * 下面的类只与抽象类产生联系， 而不和原始接口打交道
     * */
}
