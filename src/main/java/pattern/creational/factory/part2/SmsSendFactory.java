package pattern.creational.factory.part2;

/**
 * @Author linfei
 * @Date 2019/3/26 15:31
 * @Description
 */
public class SmsSendFactory implements Provider {
    @Override
    public Sender pruduct() {
        return new SmsSend();
    }
}
