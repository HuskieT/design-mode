package pattern.strategy;

/**
 * @Author linfei
 * @Date 2019/3/28 13:44
 * @Description 减法运算
 */
public class Minus extends AbstractCalculator implements ICalculator {
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");

        return arrayInt[0]-arrayInt[1];
    }
}
