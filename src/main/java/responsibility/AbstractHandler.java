package responsibility;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class AbstractHandler {

    private IHandler handler;

    public IHandler getHandler() {
        return handler;
    }
    public void setHandler(IHandler handler) {
        this.handler = handler;
    }
}
