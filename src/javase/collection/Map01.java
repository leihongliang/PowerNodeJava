package javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"123");
        map.put(2,"456");
        map.put(3,"789");
        String value = map.get(2);
        System.out.println(value);

        Collection<String> values = map.values();
        System.out.println(values);//[123, 456, 789]


    }
}
