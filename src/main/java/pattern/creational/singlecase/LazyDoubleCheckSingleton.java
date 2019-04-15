package pattern.creational.singlecase;

/**
 *  DoubleCheck双重检查
 */
public class LazyDoubleCheckSingleton {
    //volatile 禁止重排序(防止下面出现3先与2执行)  缓存一致性
    /**
     *如果不使用volatile 修饰LazyDoubleCheckSingleton；因为指令重排序的问题 3可能先于2执行
     *从而导致 多线程中 lazyDoubleCheckSingleton先分配内存地址导致 lazyDoubleCheckSingleton ！= null出现
     * 线程1因为 lazyDoubleCheckSingleton ！= null直接返回但是 线程0 还没有执行 2初始化对象 出现错误。
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
                    // 2 和3 可能会被重排序
//                    intra-thread semantics
//                    ---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
