package templateMethod;

/**
 * 模板方法模式（定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用）
 * Created by lyc28724 on 2017/9/27.
 */
public abstract class PreCalculator {
    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }

    // 需要被子类重写，具体不同的算法
    public abstract int calculate(int num1, int num2);

    // 算法的通用部分
    public int calculate(String exp, String opt) {
        int[] array = split(exp, opt);
        return calculate(array[0], array[1]);
    }
}
