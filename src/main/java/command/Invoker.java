package command;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Invoker {
    private ICommand command;
    private String message;

    public Invoker(ICommand command, String message) {
        this.command = command;
        this.message = message;
    }

    public void action() {
        command.exe(this.message);
    }
}
