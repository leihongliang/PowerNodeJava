package reflect;
/**
 * 三种方法获取类的字节码
 */
public class reflect01 {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = "abc";
        Class a = Class.forName("java.lang.String");
        Class b = s.getClass();
        Class c = String.class;
        System.out.println(a);// class java.lang.String
        System.out.println(b);// class java.lang.String
        System.out.println(c);// class java.lang.String
    }
}
