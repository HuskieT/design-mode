package pattern.creational.prototype.old;

import java.io.*;

/**
 * @Author linfei
 * @Date 2019/3/27 17:42
 * @Description 原型模式
 */

public class ProtoType implements Cloneable, Serializable {
    private static final long UID = 1L;
    private  String str;
    private SerializableObject object ;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public SerializableObject getObject() {
        return object;
    }

    public void setObject(SerializableObject object) {
        this.object = object;
    }

    //潜复制
    public Object clone() throws CloneNotSupportedException {
        ProtoType protoType = (ProtoType)super.clone();
        return protoType;
    }
    //深度复制
    public Object deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        //要实现深复制 需要采用流的形式读入当前对象的二进制输入，在写出二进制数据对应的对象。
        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();

    }







}
