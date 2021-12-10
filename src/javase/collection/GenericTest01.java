package javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        //List myList = new ArrayList();
        //创建的时候指定集合中存储的类型
        List<Animal> myList = new ArrayList<>();
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);
//        Iterator it = myList.iterator();
//        while (it.hasNext()){
//            Object obj = it.next();
//            //向下转型
//            if (obj instanceof Animal){
//                Animal a = (Animal) obj;
//                a.move();
//            }
        //获取迭代器
        //表示迭代器迭代的是Animal类型
        Iterator<Animal> it = myList.iterator();
        //Iterator it = myList.iterator();
        while (it.hasNext()){
            //使用泛型之后每一次迭代返回的数据都是Animal类型
            Animal obj = it.next();
            //不需要强制类型转换，向下转型
            //if (obj instanceof Animal){
            //    Animal a = (Animal) obj;
            obj.move();
        }


    }
}
class Animal{
    public void move(){
        System.out.println("animal moves!");
    }

}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("cat catchs mouse!");
    }
}
class Bird extends Animal{
    public void catchMouse(){
        System.out.println("bird can fly!");
    }
}
