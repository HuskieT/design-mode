package pattern.factory.part2;

/**
 * @Author linfei
 * @Date 2019/3/26 15:31
 * @Description
 */
public class MailSendFactory implements Provider{
    public Sender pruduct() {
        return new MailSend();
    }
}
