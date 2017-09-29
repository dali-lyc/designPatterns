package visitor;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public class Visitor1 implements IVisitor {
    @Override
    public void visit(ISubject subject) {
        System.out.println("vistor1 visit " + subject.getSubject());
    }
}
