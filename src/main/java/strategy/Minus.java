package strategy;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Minus extends PreCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] array = split(exp, "-");
        return array[0] - array[1];
    }
}
