package Iterator;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Main {
    public static void main(String[] args) {
        ICollection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
