package pattern.factory.part2;

/**
 * @Author linfei
 * @Date 2019/3/26 15:32
 * @Description 工厂方法模式 （一个工厂产生一个品类的产品 ，支持增加产品 ）
 */
public class Test2 {
    public static void main(String[] args) {
        Provider provider = new MailSendFactory();
        Sender sender = provider.pruduct();
        sender.send();
    }
}
