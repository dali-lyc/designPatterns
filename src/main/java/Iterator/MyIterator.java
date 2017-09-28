package Iterator;

/**
 * 迭代模式（迭代器模式就是顺序访问集合中的对象：一是需要遍历的对象，即集合对象，二是迭代器对象，用于对集合对象进行遍历访问）
 * Created by lyc28724 on 2017/9/27.
 */
public class MyIterator implements Iterator {

    private ICollection collection;
    private int pos = -1;

    public MyIterator(ICollection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
