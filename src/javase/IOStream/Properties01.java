package javase.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 将userinfo文件中的数据加载到properties对象当中
 */
public class Properties01 {
    public static void main(String[] args) {
        // properties是一个map集合，key和value都是string类型，
        try {
            FileReader reader = new FileReader("src/javase/IOStream/userinfo");
            Properties pro = new Properties();
            pro.load(reader);// 自动将=左边作为key，右边作为value
            String username = pro.getProperty("username");
            System.out.println(username);
            System.out.println(pro.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
