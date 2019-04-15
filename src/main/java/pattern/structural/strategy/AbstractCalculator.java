package pattern.structural.strategy;

/**
 * @Author linfei
 * @Date 2019/3/28 13:40
 * @Description 辅助类
 */
public abstract  class AbstractCalculator {

    public  int[] split(String exp,String opt){
        String arry[] =exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(arry[0]);
        arrayInt[1] = Integer.parseInt(arry[1]);
        return arrayInt;
    }

}
