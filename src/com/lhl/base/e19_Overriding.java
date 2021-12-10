package com.lhl.base;

public class e19_Overriding{
    public static void main(String[] args){
        Animal a = new Animal();
        a.move();
        Cat c = new Cat();
        c.move();
        Bird b = new Bird();
        b.move();
    }
}
class duotai{
    public static void main(String[] args){
        Animal a2 = new Cat(); //向上转型 引用数据类型Animal，创建对象类型Cat
        a2.move();
//        a2.catchMouse();这是错的！！！
        Cat c2 = (Cat) a2;
        c2.catchMouse();
        Animal a3 = new Bird();
        /**
         * 以下程序编译没有问题，因为编译器检查到a3的数据类型是Animal
         * 程序虽然编译通过，但程序在运行阶段会出现异常，以为JVM堆内存当中真实存在的对象是Brid类型，
         * Brid对象无法转换成Cat对象米以内两种类型之间不存在任何继承欢喜，此时出现著名的异常
         * java.lang.ClassCastException 类型转换异常，“向下转型”时总是会发生
         */
//        com.lhl.base.Cat c3 = (com.lhl.base.Cat) a3;
        if(a3 instanceof Cat){
            Cat c3 = (Cat) a3;
            c3.catchMouse();
        }else if (a3 instanceof Bird){//a3是一个Bird类型的对象
            Bird b2 = (Bird) a3;
            b2.fly();
        }
    }
}
class Animal {
    public void move(){
        System.out.println("animal is moving");
    }
}
class Cat extends Animal {
    public void move(){
        System.out.println("cat is moving");
    }
    public void catchMouse(){
        System.out.println("cat catches mouse");
    }
}
class Bird extends Animal {
    public void move() {
        System.out.println("bird is flying");
    }
    public void fly(){
        System.out.println("bird can fly");
    }
}