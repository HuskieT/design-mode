package pattern.template;

/**
 * @Author linfei
 * @Date 2019/3/28 14:06
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plu();
        int result = cal.calculate(exp,"\\+");
        System.out.println(result);
    }
}
