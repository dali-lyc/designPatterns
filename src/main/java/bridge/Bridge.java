package bridge;


/**
 * Created by lyc28724 on 2017/9/26.
 */
public abstract class Bridge {
    private ISource source;

    public void method() {
        source.method();
    }

    public ISource getSource() {
        return source;
    }

    public void setSource(ISource source) {
        this.source = source;
    }
}
