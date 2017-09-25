package builder;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class SmsSender implements abstractFactory.ISender {
    @Override
    public void send() {
        System.out.println("send sms");
    }
}
