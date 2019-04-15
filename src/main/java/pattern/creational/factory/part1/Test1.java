package pattern.creational.factory.part1;

import static pattern.creational.factory.part1.SendFactory.MailSender;

/**
 * @Author linfei
 * @Date 2019/3/26 15:41
 * @Description 简单工厂模式
 */
public class Test1 {
    public static void main(String[] args) {
        Sender sender = MailSender();
        sender.send();

        //通过反射弥补简单工厂的不足
        SendFactory factory = new SendFactory();
        try {
            Sender sender1 =  factory.SendInfo( MailSend.class );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
