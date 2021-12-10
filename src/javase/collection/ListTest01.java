package javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();

        myList.add("abc");
        myList.add("def");

        //遍历，使用迭代器方式
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }

        //根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        //通过下标遍历
        for (int i = 0; i<myList.size();i++){
            Object Obj = myList.get(i);
            System.out.println(myList.get(i));
        }

        //使用foreach
        for (Object s : myList){
            System.out.println(s);
        }

    }
}
