package builder;

import abstractFactory.*;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class MailSender implements abstractFactory.ISender {
    @Override
    public void send() {
        System.out.println("send mail");
    }
}
