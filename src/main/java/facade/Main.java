package facade;

/**
 * 外观模式（将类和类之间的关系配置到配置文件中，外观模式将他们的关系放在一个Facade类中，降低了类类之间的耦合度）
 * Created by lyc28724 on 2017/9/26.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
