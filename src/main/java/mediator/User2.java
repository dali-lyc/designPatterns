package mediator;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public class User2 extends User {

    public User2(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exec!");
    }
}
