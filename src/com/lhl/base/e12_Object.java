package com.lhl.base;

/*
tips
 1 对象
 2 空指针异常
 */
/*
局部变量 方法体中声明 栈内存
成员变量 方法体外声明
    实例变量 前边修饰符没有static  堆内存
    静态变量 前边修饰符有 static   方法区内存
 */
public class e12_Object {
    public static void main(String[] args) {
        User u = new User();//Student是一个引用数据类型，s是实例变量名（引用），new Student是一个学生对象
        u.name = "lei";
        System.out.println(u.name);

//        u.addr = new com.lhl.base.Address();
        u.addr.city = "hangzhou";
        System.out.println(u.addr.city);
        System.out.println(u.addr2);
    }
}

class User {
    String name;
    Address addr = new Address();//Address是一个引用数据类型 addr是一个实例变量（引用）
    Address addr2;//和上面一样
    int age;
    boolean sex;
    private int age02;

    public void setAge02 (int a){
        if(a<0 || a>100){
            System.out.println("Wrong!!!");
            return;
        }
        age02 = a;
    }
    public int getAge02 ( ){
        return age02;
    }
}

class Address{
    String city= "wuhan";
}

//class text{
//    com.lhl.base.User u = new com.lhl.base.User();
//    com.lhl.base.Address com.lhl.base.b = new com.lhl.base.Address();
//    u.addr = com.lhl.base.b;
//}

class test12{
    public static void main(String[] args){
        Customer c = new Customer();
        System.out.println(c.id);
        c = null; // 地址为空，空指针异常
        System.out.println(c.id);

    }
}

class Customer{
    String id;
}