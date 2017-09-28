package command;

/**
 * 命令模式（命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开）
 * Created by lyc28724 on 2017/9/27.
 */
public class Main {
    public static void main(String[] args) {
        // 命令实际执行者
        Receiver receiver = new Receiver();
        // 命令类实现了命令接口，依赖命令的执行者
        ICommand command = new MyCommand(receiver);
        // 命令发出者，依赖命令类，传递要执行的命令内容
        Invoker invoker = new Invoker(command, "execute message");
        // 执行命令
        invoker.action();
    }
}
