package mediator;

/**
 * 中介者模式（用来降低类类之间的耦合）
 * Created by lyc28724 on 2017/9/28.
 */
public class Main {
    public static void main(String[] args) {
        IMediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
