package visitor;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public class Visitor2 implements IVisitor {
    @Override
    public void visit(ISubject subject) {
        System.out.println("visitor2 visit " + subject.getSubject());
    }
}
