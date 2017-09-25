package singleton;

/**
 * 单例模式
 * Created by lyc28724 on 2017/9/25.
 */
public class Singleton {

    // 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Singleton instance = null;

    // 私有构造方法，防止被实例化
    private Singleton() {

    }

    // 线程不安全
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 静态工程方法，创建实例，多线程环境下对对象加锁，双重非空判定
    public static Singleton getInstanceSafely() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
