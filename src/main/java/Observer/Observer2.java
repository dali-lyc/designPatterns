package Observer;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Observer2 implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("observer2 has received: " + message);
    }
}
