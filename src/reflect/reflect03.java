package reflect;

import java.io.*;
import java.util.Properties;

public class reflect03 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/reflect/classinfo.properties");
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
