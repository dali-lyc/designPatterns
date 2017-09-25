package decorator;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class Source implements ISourceAble {
    @Override
    public void method() {
        System.out.println("the source method");
    }
}
