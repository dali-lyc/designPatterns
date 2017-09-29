package interpreter;

/**
 * 解释器模式（解释器模式用来做各种各样的解释器）
 * Created by lyc28724 on 2017/9/29.
 */
public class Main {
    public static void main(String[] args) {
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
