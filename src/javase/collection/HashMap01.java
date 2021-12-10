package javase.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        //
        Map<Integer, String > map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"abc");
        map.put(2,"abc");
        System.out.println(map.size());// 2

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
