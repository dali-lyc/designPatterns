package Proxy;

/**
 * 代理模式（采用一个代理类调用原有的方法，且对产生的结果进行控制。使用代理模式，可以将功能划分的更加清晰，有助于后期维护）
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
