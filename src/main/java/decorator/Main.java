package decorator;

/**
 * 适配器模式
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {
        ISourceAble sourceAble = new Source();
        ISourceAble decorator = new Decorator(sourceAble);
        decorator.method();
    }
}
