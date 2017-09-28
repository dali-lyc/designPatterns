package bridge;

/**
 * Created by lyc28724 on 2017/9/26.
 */
public class SourceSub1 implements ISource {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
