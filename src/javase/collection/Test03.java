package javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test03 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        String s1 = new String("abc");
        String s2 = new String("abc");
        collection.add(s1);
        System.out.println(collection.contains(s2));//true

        User u1 = new User("abc");
        User u2 = new User("abc");
        collection.add(u1);
        System.out.println(collection.contains(u2));//false

        String s3 = new String("def");
        String s4 = new String("def");
        collection.add(s3);
        collection.remove(s4);
        System.out.println(collection.contains(s3));//false
    }
}
class User{
    private String name;
    public User(String name){
        this.name = name;
    }
}