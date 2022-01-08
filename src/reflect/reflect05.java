package reflect;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 文件路径
 */
public class reflect05 {
    public static void main(String[] args) {
        // Thread.currentThread() 当前线程对象
        // getContextClassLoader() 线程对象的方法，可以获取到当前线程的类加载器对象
        // getResource() 【获取路径】这是类加载器的方法，当前线程的类加载器默认从类的根路径下加载资源
        String path = Thread.currentThread().getContextClassLoader().
                getResource("tempfile").getPath();// 类的目录开始
        System.out.println(path);// 获取绝对路径

        // 方法三 资源绑定器
        // 只能绑定xxx.properties 文件，必须在类路径下，写路径时，后缀不能带
        ResourceBundle bundle = ResourceBundle.getBundle("reflect/classinfo");
        String className = bundle.getString("className");
        System.out.println(className);


    }
}
