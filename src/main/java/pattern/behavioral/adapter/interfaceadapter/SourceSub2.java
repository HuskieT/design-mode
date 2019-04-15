package pattern.behavioral.adapter.interfaceadapter;

/**
 * @Author linfei
 * @Date 2019/3/28 11:03
 * @Description
 */
public class SourceSub2 extends Wrapper{
    @Override
    public void method2() {
        System.out.println("SourceSub1********method2");
    }

    @Override
    public void method3() {
        System.out.println("SourceSub1*******method3*");
    }
}
