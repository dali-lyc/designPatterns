package abstractFactory;

/**
 * 抽象工厂模式
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {

        IFactory sendMailFactory = new SendMailFactory();
        ISender mailSender = sendMailFactory.create();
        mailSender.send();

        IFactory sendSmsFactory = new SendSmsFactory();
        ISender smsSender = sendSmsFactory.create();
        smsSender.send();

    }
}
