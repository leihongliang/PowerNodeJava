package javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代器 集合遍历
 */
public class Test02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());

        //1 获取几个对象的迭代器对象Iterater
        Iterator iterator = c.iterator();
        //2 通过以上的迭代器对开始迭代/遍历集合
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        c.contains("abc");
    }
}
