package visitor;

/**
 * 访问者模式（访问者模式就是一种分离对象数据结构与行为的方法，适用于数据结构相对稳定算法又易变化的系统）
 * Created by lyc28724 on 2017/9/28.
 */
public class Main {
    public static void main(String[] args) {
        // 不同的访问者针对被观察者的数据实现不同的算法
        IVisitor visitor1 = new Visitor1();
        IVisitor visitor2 = new Visitor2();
        // 而被观察者的数据格式不变
        ISubject subject = new MySubject("subject content");
        subject.accept(visitor1);
        subject.accept(visitor2);
    }
}
