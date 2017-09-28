package command;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class MyCommand implements ICommand {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe(String message) {
        receiver.action(message);
    }
}
