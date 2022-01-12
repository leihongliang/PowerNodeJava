package reflect;
import java.lang.reflect.Constructor;

/**
 * 反射机制调用构造方法
 */
public class reflect11 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("reflect.Vip");
        // 获取到有参数的构造方法
        Constructor con = c.getConstructor(int.class, String.class, String.class, boolean.class);
        // 调用构造方法new对昂
        Object obj = con.newInstance(1234, "lei", "1999608", true);
        System.out.println(obj.toString());

    }
}
class Vip{
    int no;
    String name;
    String birth;
    boolean sex;
    public Vip(){
    }
    public Vip(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}