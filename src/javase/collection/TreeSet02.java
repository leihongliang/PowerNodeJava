package javase.collection;

import java.util.TreeSet;

/**
 * 二叉树排序
 */
public class TreeSet02 {
    public static void main(String[] args) {
        Customer p1 = new Customer(6);
        Customer p2 = new Customer(2);
        Customer p3 = new Customer(5);
        Customer p4 = new Customer(1);
        TreeSet<Customer> customers = new TreeSet<>();
        customers.add(p1);
        customers.add(p2);
        customers.add(p3);
        customers.add(p4);

        for (Customer c : customers){
            System.out.println(c);//1,2,5,6 升序排序
        }
    }
    //放在TreeSet集合中元素需要实现java.lang.Comparable接口
    //并且实现compareTo方法，equals可以不写

}
class Customer implements Comparable<Customer>{
    int age;
    public Customer(int age) {
        this.age = age;
    }

    public String toString(){
        return "age= "+age+"";
    }

    //编写比较规则，比较逻辑 k.compareTO(t.kry)
    //关于二叉树数据结构，大于0右子树，小于0左子树
    @Override
    //01 compareTo(o2)
    public int compareTo(Customer o) {
        // this 是o1
        // o 是o2
        int age1 = this.age;
        int age2 = o.age;
        return Integer.compare(age1, age2);
        //Method 2
        //return this.age- c.age；
        //return Integer.compare(age1, age2);
    }
}