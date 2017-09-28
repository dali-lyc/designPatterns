package Observer;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Main {
    public static void main(String[] args) {
        ISubject sub = new MySubject();
        IObserver observer1 = new Observer1();
        IObserver observer2 = new Observer2();

        sub.add(observer1);
        sub.add(observer2);
        sub.operation();

        sub.del(observer2);
        sub.operation();
    }
}
