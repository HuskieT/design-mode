package pattern.factory.part1;

/**
 * @Author linfei
 * @Date 2019/3/26 15:37
 * @Description
 */
public class SendFactory {

    public static Sender MailSender(){
        return  new MailSend();
    }

    public static Sender SmsSender(){
        return  new SmsSend();
    }

    public Sender SendInfo(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Sender sender;
        sender = (Sender) Class.forName( c.getName() ).newInstance();
        return sender;
    };
}
