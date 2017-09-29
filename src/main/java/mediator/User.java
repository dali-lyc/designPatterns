package mediator;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public abstract class User {
    private IMediator mediator;

    public IMediator getMediator() {
        return mediator;
    }

    public User(IMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
