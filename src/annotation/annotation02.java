package annotation;
import java.lang.reflect.Method;
/**
 * 反射获取注解。
 */
public class annotation02 {

    @MyAnnotation4(username = "lei", password = "123")
    public void doSome(){

    }

    public static void main(String[] args) throws Exception {
        // 获取类
        Class c = Class.forName("annotation.annotation02");
        //获取doSome方法
        Method doSomeMethod = c.getMethod("doSome");
        if (doSomeMethod.isAnnotationPresent(MyAnnotation4.class)){
            MyAnnotation4 myAnnotation4 = doSomeMethod.getAnnotation(MyAnnotation4.class);
            System.out.println(myAnnotation4.username());
            System.out.println(myAnnotation4.password());
        }
    }
}
