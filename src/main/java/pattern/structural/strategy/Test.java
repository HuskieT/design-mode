package pattern.structural.strategy;

/**
 * @Author linfei
 * @Date 2019/3/28 13:45
 * @Description 策略模式
 */
public class Test {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
