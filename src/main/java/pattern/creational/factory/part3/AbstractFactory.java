package pattern.creational.factory.part3;

/**
 * @Author linfei
 * @Date 2019/3/26 15:45
 * @Description 抽象工厂接口
 */
public interface AbstractFactory<T> {

    T getBean(Class<T> t) throws Exception;

}
