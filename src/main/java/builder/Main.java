package builder;

/**
 * 建造者模式
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.createMailSender(5);
        builder.createSmsSender(5);
    }
}
