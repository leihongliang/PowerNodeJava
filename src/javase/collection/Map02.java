package javase.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 */
public class Map02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"123");
        map.put(2,"456");
        map.put(3,"789");

        //方法一
        //获取所有的kay
        Set<Integer> keys = map.keySet();
        System.out.println(keys);//[1,2,3]

        System.out.println("-----迭代器------");
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            //取出一个key
            Integer key = it.next();
            //通过key，获取value
            String value = map.get(key);
            System.out.println(value);
        }

        System.out.println("-----foreach------");
        for (Integer key : keys){
            System.out.println(map.get(key));
        }

        //方法二
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
        System.out.println("-----迭代器------");
        while (it2.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + " = "+ value);
        }
        System.out.println("-----foreach------");
        for (Map.Entry<Integer, String> node : set){
            System.out.println(node.getKey()+"="+node.getValue());
        }


    }
}
