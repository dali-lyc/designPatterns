package visitor;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public interface ISubject {

    String getSubject();

    void accept(IVisitor visitor);
}
