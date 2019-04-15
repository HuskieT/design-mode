package pattern.creational.singlecase;

/**
 * Created by geely 懒汉单例
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
        //@@@反射防御
        if(lazySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    /**
     * synchronized 同步线程锁解决 多线程安全问题
     */
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
          //@@@反射攻击示例
//        Class objectClass = LazySingleton.class;
//        Constructor c = objectClass.getDeclaredConstructor();
//        c.setAccessible(true);
//
//        LazySingleton o1 = LazySingleton.getInstance();
//
//        Field flag = o1.getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(o1,true);
//
//
//        LazySingleton o2 = (LazySingleton) c.newInstance();
//
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1==o2);
//    }

}
