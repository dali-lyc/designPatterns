package visitor;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public class MySubject implements ISubject {

    private String content;

    public MySubject(String content) {
        this.content = content;
    }

    public MySubject() {

    }

    @Override
    public String getSubject() {
        return content;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
