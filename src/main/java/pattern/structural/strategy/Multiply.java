package pattern.structural.strategy;

/**
 * @Author linfei
 * @Date 2019/3/28 13:45
 * @Description 乘法运算
 */
public class Multiply extends AbstractCalculator implements ICalculator {
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\*");

        return arrayInt[0]*arrayInt[1];
    }
}
