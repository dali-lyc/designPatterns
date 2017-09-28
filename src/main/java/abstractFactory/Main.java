package abstractFactory;

/**
 * 抽象工厂模式（想要拓展程序可以创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码）
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
