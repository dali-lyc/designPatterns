package Iterator;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public interface Iterator {
    Object previous();

    Object next();

    boolean hasNext();

    Object first();
}
