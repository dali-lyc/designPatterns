package bridge;

/**
 * Created by lyc28724 on 2017/9/26.
 */
public class MyBridge extends Bridge {
    public void method() {
        getSource().method();
    }
}
