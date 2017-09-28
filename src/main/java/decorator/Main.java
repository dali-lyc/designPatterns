package decorator;

/**
 * 装饰者模式（给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例）
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {
        ISourceAble sourceAble = new Source();
        ISourceAble decorator = new Decorator(sourceAble);
        decorator.method();
    }
}
