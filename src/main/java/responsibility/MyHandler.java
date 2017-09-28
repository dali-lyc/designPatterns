package responsibility;

/**
 * 责任链模式（有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求）
 * Created by lyc28724 on 2017/9/27.
 */
public class MyHandler extends AbstractHandler implements IHandler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + " execute!");
        if (null != getHandler()) {
            getHandler().operator();
        }
    }
}
