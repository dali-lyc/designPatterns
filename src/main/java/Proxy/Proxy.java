package Proxy;

/**
 * 代理模式
 * Created by lyc28724 on 2017/9/25.
 */
public class Proxy implements ISourceAble {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        System.out.println("before source method");
        source.method();
        System.out.println("after source method");
    }
}
