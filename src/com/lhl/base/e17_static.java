package com.lhl.base;/*

 */

public class e17_static {
    public static void main(String[] args){
        Chinese zhangsan = new Chinese("1", "张三");
        System.out.println(zhangsan.id+","+zhangsan.name+","+Chinese.country);
        Chinese lisi = new Chinese("2", "李四");
        System.out.println(lisi.id+","+lisi.name+","+Chinese.country);
    }
}
class Chinese{
    //以下都是实例变量，在堆内存当中，构造方法时初始化
    String id;
    String name;
    static String country = "china";//静态变量

    public Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class StaticTest2{
    static{
        System.out.println("静态代码块");
    }
    public static void main(String[] args){
        System.out.println("main begin");
    }
}
class StaticTest3{
    public StaticTest3(){
        System.out.println("这是构造方法");
    }
    {
        System.out.println("这是实例代码块，我先执行");
    }
    public static void main(String[] args){
        System.out.println("main begin");
        new StaticTest3();
    }
}
class StaticTest4{
    public static void main(String[] args){
        System.out.println("main方法重载");
    }
    public static void main(int i){
        System.out.println(i);
    }
}
class StaticTest5{
    //实例变量
    int i = 100;
    //实例方法
    public void doSome(){
    }
    //静态方法[静态上下文]
    public static void main(String[] args){
//        System.out.printlin(i);
//        doSome();
        StaticTest5 st = new StaticTest5();
        System.out.println(st.i);
        st.doSome();
    }
}