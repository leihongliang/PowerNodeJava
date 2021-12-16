package javase.collection;

import java.util.*;

public class Collections01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.synchronizedList(list);

        list.add("ccc");
        list.add("bbb");
        list.add("aaa");
        Collections.sort(list);
        for (String s : list){
            System.out.println(s);//aaa,bbb,ccc
        }

        //对List集合中元素排序
        List<Customer2> list2 = new ArrayList<>();
        list2.add(new Customer2(3));
        list2.add(new Customer2(1));
        Collections.sort(list2);
        for (Customer2 c : list2){
            System.out.println(c);//aaa,bbb,ccc
        }

        //对Set集合排序
        Set<String> list3 = new HashSet<>();
        list3.add("ccc");
        list3.add("bbb");
        list3.add("aaa");
        List<String> list4 = new ArrayList<>(list3);
        Collections.sort(list4);
        for (String s : list4){
            System.out.println(s);//aaa,bbb,ccc
        }

    }
}
//  必须实现Comparable接口，才能使用collections
class Customer2 implements Comparable<Customer2>{
    int  age;
    public Customer2(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer2 o) {
        return Integer.compare(this.age,o.age);
    }

    @Override
    public String toString() {
        return "B_OOP.e15_this.Customer2{" +
                "age=" + age +
                '}';
    }
}
