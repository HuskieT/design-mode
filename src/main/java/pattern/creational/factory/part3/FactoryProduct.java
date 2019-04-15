package pattern.creational.factory.part3;

/**
 * @Author linfei
 * @Date 2019/3/26 16:24
 * @Description
 */
public class FactoryProduct<T> {

    private static FactoryProduct factoryProduct  ;

    public BeanFactory getFactory(Class<BeanFactory> t)throws Exception{
        return t.newInstance();
    }

    public static FactoryProduct getFactoryProduct(){
        if(factoryProduct==null){
            synchronized (FactoryProduct.class){
                factoryProduct = new FactoryProduct();
                return factoryProduct;
            }
        }
        return  factoryProduct;
    }
}
