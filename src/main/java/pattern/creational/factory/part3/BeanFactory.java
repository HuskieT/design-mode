package pattern.creational.factory.part3;

/**
 * @Author linfei
 * @Date 2019/3/26 16:22
 * @Description
 */
public class BeanFactory<T> implements AbstractFactory<T> {

    public T getBean(Class<T> t) throws Exception {

        return t.newInstance();
    }

}
