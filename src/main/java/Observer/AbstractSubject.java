package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式（当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化）
 * Created by lyc28724 on 2017/9/27.
 */
public abstract class AbstractSubject implements ISubject {

    List<IObserver> observers = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void del(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

}
