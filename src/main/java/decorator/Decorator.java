package decorator;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class Decorator implements ISourceAble {

    private ISourceAble sourceAble;

    public Decorator(ISourceAble sourceAble) {
        super();
        this.sourceAble = sourceAble;
    }

    @Override
    public void method() {
        System.out.println("before source method");
        sourceAble.method();
        System.out.println("after source method");
    }
}
