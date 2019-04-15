package pattern.behavioral.agency;

/**
 * @Author linfei
 * @Date 2019/3/28 13:15
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.buy();
    }
}
