package builder;

/**
 * 建造者模式（工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性）
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.createMailSender(5);
        builder.createSmsSender(5);
    }
}
