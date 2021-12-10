package javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        //接口无法实例化
        // Collection c = new Collection();
        //多态
        Collection c = new ArrayList();
        //常用方法
        c.add(1200);//自动装箱，Integer x = new Integer(1200)
        c.add("lhl");

        System.out.println(c.size());//1

        System.out.println(c.contains("lhl"));//true

        Object[] objs = c.toArray();

    }
}
