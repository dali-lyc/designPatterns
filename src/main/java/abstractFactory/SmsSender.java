package abstractFactory;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class SmsSender implements ISender {
    @Override
    public void send() {
        System.out.println("send sms");
    }
}
