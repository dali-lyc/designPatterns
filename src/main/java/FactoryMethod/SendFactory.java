package factoryMethod;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class SendFactory {

    public static ISender createMailSender() {
        return new MailSender();
    }

    public static ISender createSmsSender() {
        return new SmsSender();
    }

}
