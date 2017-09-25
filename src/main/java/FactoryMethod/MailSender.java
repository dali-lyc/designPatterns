package factoryMethod;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class MailSender implements ISender {
    @Override
    public void send() {
        System.out.println("send mail");
    }
}
