package pattern.agency;

/**
 * @Author linfei
 * @Date 2019/3/28 12:59
 * @Description
 */
public class Proxy implements Sourceable {
   private  Source source;

    public Proxy() {
        // 与装饰者模式最大的区别就在这里   装饰模式这块是有参构造 传入Source对象
        this.source = new Source();
    }

    public void buy() {
        befor();
        source.buy();
        after();
    }

    private  void befor(){

    }
    private  void after(){

    }

}
