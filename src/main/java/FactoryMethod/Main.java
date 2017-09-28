package factoryMethod;

/**
 * 工厂方法模式（凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建）
 * 通过邮件和短信两种方式发送信息
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {

    public static void main(String[] args) {

        ISender mailSender = SendFactory.createMailSender();
        mailSender.send();

        ISender smsSender = SendFactory.createSmsSender();
        smsSender.send();

    }

}
