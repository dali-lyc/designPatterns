package prototype;

import java.io.*;

/**
 * 原型模式（将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象）
 * Created by lyc28724 on 2017/9/25.
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String string;
    private int count;
    private SerializableObject obj;

    // 浅复制（将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型还是指向原对象）
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    // 深复制（将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的）
    public Object deepClone() throws IOException, ClassNotFoundException {

        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();

    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}

