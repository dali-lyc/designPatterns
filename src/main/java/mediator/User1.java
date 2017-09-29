package mediator;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public class User1 extends User {

    public User1(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exec!");
    }
}
