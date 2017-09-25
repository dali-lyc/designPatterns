package adapter;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class Adapter extends Source implements ITarget {
    @Override
    public void method2() {
        System.out.println("this is target method!");
    }
}
