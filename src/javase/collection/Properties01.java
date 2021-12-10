package javase.collection;

import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("a","AAA");
        pro.setProperty("b","BBB");

        String a = pro.getProperty("a");
        String b = pro.getProperty("b");
        System.out.println(a);
        System.out.println(b);
    }
}
