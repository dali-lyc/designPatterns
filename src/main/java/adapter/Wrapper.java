package adapter;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class Wrapper implements ITarget {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();

    }

    @Override
    public void method2() {
        System.out.println("this is target method!");

    }
}
