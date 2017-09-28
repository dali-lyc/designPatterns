package strategy;

/**
 * 策略模式（策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户）
 * Created by lyc28724 on 2017/9/27.
 */
public class Main {
    public static void main(String[] args) {
        String exp = "8+2";
        ICalculator plus = new Plus();
        int result1 = plus.calculate(exp);
        exp = "8-2";
        ICalculator minus = new Minus();
        int result2 = minus.calculate(exp);
        exp = "8*2";
        ICalculator multiply = new Multiply();
        int result3 = multiply.calculate(exp);
        exp = "8/3";
        ICalculator division = new Division();
        int result4 = division.calculate(exp);
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
    }
}
