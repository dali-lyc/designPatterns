package abstractFactory;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class SendMailFactory implements IFactory {
    @Override
    public ISender create() {
        return new MailSender();
    }
}
