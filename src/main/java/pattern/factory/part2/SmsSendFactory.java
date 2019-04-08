package pattern.factory.part2;

/**
 * @Author linfei
 * @Date 2019/3/26 15:31
 * @Description
 */
public class SmsSendFactory implements Provider {
    public Sender pruduct() {
        return new SmsSend();
    }
}
