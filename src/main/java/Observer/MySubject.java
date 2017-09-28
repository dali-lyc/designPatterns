package Observer;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        notifyObservers("a message send by subject");
    }
}
