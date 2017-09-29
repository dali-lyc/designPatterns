package state;

/**
 * 状态模式（根据对象的不同属性状态，触发不同的行为）
 * Created by lyc28724 on 2017/9/28.
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {
        System.out.println("execute method1!");
    }

    public void method2() {
        System.out.println("execute method2!");
    }
}
