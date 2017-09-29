package state;

/**
 * Created by lyc28724 on 2017/9/28.
 */
public class Main {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("state1");
        context.method();

        state.setValue("state2");
        context.method();

        state.setValue("state3");
        context.method();
    }
}
