package javase.collection.HashMapWork01;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("lhl");
        Student s2 = new Student("lhl");
        System.out.println(s1.equals(s2));// 重写equals之后是true
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());// 重写hash之后哈希值相同

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());// 1 重写hash和equals之后是1，只重写一项是2

    }
}
