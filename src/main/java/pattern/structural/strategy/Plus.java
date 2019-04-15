package pattern.structural.strategy;

/**
 * @Author linfei
 * @Date 2019/3/28 13:42
 * @Description 加法运算
 */
public class Plus extends AbstractCalculator implements ICalculator{

    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");

        return arrayInt[0]+arrayInt[1];
    }
}
