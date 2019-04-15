package pattern.creational.factory.part1;


/**
 * @Author linfei
 * @Date 2019/3/26 15:19
 * @Description
 */
public class SmsSend implements Sender{

    public void send() {
        System.out.println("this is SmsSend");
    }
}
