package pattern.creational.factory.part2;

/**
 * @Author linfei
 * @Date 2019/3/26 15:19
 * @Description
 */
public class MailSend implements Sender{
    @Override
    public void send() {
        System.out.println("this is MailSend");
    }
}
