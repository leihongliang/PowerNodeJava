package B_OOP.e15_this;

public class Customer2 {
    String name;//实例变量

    //构造方法 创建对象
    public Customer2() {
    }
    //普通方法 实例方法
    public void shopping(){
        System.out.println(this.name+" is shopping");
    }
    public static void dosome(){
//        System.out.println(name);//dosome方法调用不是对象去调用，是一个类名去调用，执行过程中没有“当前对象”，没有this
        Customer2 c = new Customer2();
        c.name = "chuanjianduixiang";
        System.out.println(c.name);//必须通过 类名.
    }

}
