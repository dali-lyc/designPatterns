package Observer;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public interface ISubject {
    // 增加观察者
    void add(IObserver observer);

    // 去除观察者
    void del(IObserver observer);

    // 通知所有观察者
    void notifyObservers(String message);

    // 被观察者自身的操作
    void operation();
}
