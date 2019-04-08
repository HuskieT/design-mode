package pattern.factory.part3;

import static pattern.factory.part3.FactoryProduct.getFactoryProduct;

/**
 * @Author linfei
 * @Date 2019/3/26 15:43
 * @Description 抽象工厂模式 （一个工厂产生多个品类的产品；支持增加品类和产品 ）
 */
public class Test3 {
    public static void main(String[] args) throws Exception{
        FactoryProduct factoryProduct = getFactoryProduct();
        BeanFactory beanFactory = (BeanFactory) factoryProduct.getFactory(BeanFactory.class);
        IphoneX x =  (IphoneX)beanFactory.getBean(IphoneX.class);
        x.newInstance().show();
    }
}
