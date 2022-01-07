package reflect;

/**
 * 通过反射机制的方法创建对象
 * 获取Class，通过Class来实例化对象
 */
public class reflect02 {
    public static void main(String[] args) {
        try {
            // 通过反射机制，获取Class，通过Class来实例化对象
            Class c = Class.forName("reflect.User");
            Object obj = c.newInstance();// 调用的是无参构造方法，必须保证无参构造存在
            System.out.println(obj);// 1 reflect.User@1b6d3586
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class User{
    public User(){
        System.out.println(1);
    }
}