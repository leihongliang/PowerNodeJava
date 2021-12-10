package com.lhl.base;

public class e20_polymorphism {
    public static void main(String[] args){
        Master lhl = new Master();
        Dog d = new Dog();
        lhl.feed(d);
    }
}
class LittleCat extends Pet{
    public void eat(){
        System.out.println("littlecat is eating fish");
    }
}
class Master{
    public void feed(Pet p){//父类型引用指向子类型对象
        p.eat();
    }
}
class Dog extends Pet{
    public void eat(){
        System.out.println("dog is eating");
    }
}
class Pet{
    public void eat(){
    }
}