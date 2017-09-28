package Iterator;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class MyCollection implements ICollection {

    public String[] coll = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return coll[i];
    }

    @Override
    public int size() {
        return coll.length;
    }
}
