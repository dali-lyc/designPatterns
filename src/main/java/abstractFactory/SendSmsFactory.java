package abstractFactory;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class SendSmsFactory implements IFactory {
    @Override
    public ISender create() {
        return new SmsSender();
    }
}
