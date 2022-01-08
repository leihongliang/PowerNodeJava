package reflect;

/**
 * Class.forname()
 * 执行某一个类的静态代码块
 */
public class reflect04 {
    public static void main(String[] args) {
        try {
            Class.forName("reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    // 静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("静态代码块已执行");
    }
}