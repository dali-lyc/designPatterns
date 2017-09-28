package templateMethod;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Main {
    public static void main(String[] args) {
        String exp = "8+2";
        PreCalculator plus = new Plus();
        int result = plus.calculate(exp, "\\+");
        System.out.println(result);
    }
}
