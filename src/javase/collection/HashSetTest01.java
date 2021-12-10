package javase.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();
        strs.add("a");
        strs.add("d");
        strs.add("c");
        strs.add("b");

        for (String s : strs){
            System.out.println(s);
        }


    }
}