package pattern.factory.part3;

/**
 * @Author linfei
 * @Date 2019/3/26 16:02
 * @Description 手机接口
 */
public interface Phone<T> {
    void show();
    T newInstance();
}
