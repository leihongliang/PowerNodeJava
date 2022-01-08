package reflect;

import java.io.*;
import java.util.Properties;

public class reflect03 {
    public static void main(String[] args) {
        try {
            // 方法一
            String path = Thread.currentThread().getContextClassLoader().
                    getResource("reflect/classinfo.properties").getPath();// 类的目录开始
            FileReader reader0 = new FileReader(path);

            // 方法二 直接以流的形式
            // Thread.currentThread() 当前线程对象
            // getContextClassLoader() 线程对象的方法，可以获取到当前线程的类加载器对象
            // getResource() 【获取路径】这是类加载器的方法，当前线程的类加载器默认从类的根路径下加载资源
            InputStream reader = Thread.currentThread().getContextClassLoader().
                    getResourceAsStream("reflect/classinfo.properties");


            Properties prop = new Properties();
            prop.load(reader);
            reader.close();
            String className = prop.getProperty("className");
            Class c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);// 自动执行User类的无参构造方法

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
