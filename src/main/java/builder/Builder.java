package builder;

import abstractFactory.ISender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class Builder {

    private List<ISender> list = new ArrayList<>();

    public void createMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void createSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

}
