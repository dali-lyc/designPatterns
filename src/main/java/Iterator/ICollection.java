package Iterator;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public interface ICollection {
    Iterator iterator();

    Object get(int i);

    int size();
}
