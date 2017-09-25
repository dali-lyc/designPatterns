package singleton;

/**
 * Created by lyc28724 on 2017/9/25.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstanceSafely();
        System.out.println(singleton2);
    }
}
