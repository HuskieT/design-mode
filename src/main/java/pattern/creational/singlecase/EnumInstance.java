package pattern.creational.singlecase;

/**
 * 枚举 单例
 */
public enum EnumInstance {
    /**
     * 枚举类 没有无参构造器 （查看enum 枚举 源码)
     * 枚举类型无法反射创建 （查看 Constructor.newInstance() 方法源码 ）
     */
    INSTANCE{
        protected  void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
