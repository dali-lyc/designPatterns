package adapter;

/**
 * 适配器模式
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {

    public static void main(String[] args) {

        // 类适配器模式（创建一个新类，继承原有的类，并实现新的接口）
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();

        // 对象适配器模式（创建一个Wrapper类，持有原类的一个实例，调用实例的方法）
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();

        // 接口适配器模式（当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper实现所有方法，继承抽象类即可）
        SourceSub1 sourceSub1 = new SourceSub1();
        sourceSub1.method1();
        sourceSub1.method2();
        SourceSub2 sourceSub2 = new SourceSub2();
        sourceSub2.method1();
        sourceSub2.method2();

    }

}
