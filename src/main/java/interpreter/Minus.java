package interpreter;

/**
 * Created by lyc28724 on 2017/9/29.
 */
public class Minus implements IExpression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
