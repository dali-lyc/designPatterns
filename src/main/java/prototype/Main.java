package prototype;

import java.io.IOException;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        SerializableObject obj1 = new SerializableObject();
        prototype.setString("1");
        prototype.setCount(1);
        prototype.setObj(obj1);
        Prototype prototype2 = (Prototype) prototype.clone();
        prototype2.setString("2");
        prototype2.setCount(2);
        Prototype prototype3 = (Prototype) prototype.deepClone();
        prototype3.setString("3");
        prototype3.setCount(3);
    }
}
