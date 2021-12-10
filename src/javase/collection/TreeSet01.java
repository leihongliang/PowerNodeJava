package javase.collection;

import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        /**
         * 可排序集合
         */

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("abc");
        treeSet.add("abd");
        treeSet.add("abe");

        for (String s : treeSet){
            System.out.println(s);//abc abd abe
        }

        /**
         * 自定义类型
         * 异常：Person类没有实现java.lang.Comparable接口 551
         */
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(p1);
        personTreeSet.add(p2);

        for (Person s : personTreeSet){
            System.out.println(s);//
        }
    }
    static class Person{
        int age;

        public Person(int age) {
            this.age = age;
        }

        public String toString(){
            return "age= "+age+"";
        }

    }

}
