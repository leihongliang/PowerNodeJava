package B_OOP.e19_inheritance;

/**
 *
 */

public class Sub extends Base{
    void method(){  //覆盖父类的实例方法method()
        System.out.println("method of Sub");
    }
    static void staticMethod(){  //隐藏父类的静态方法staticMethod()
        System.out.println("static method of Sub");
    }
    public static void main(String args[]){
        Base sub1=new Sub();  //sub1变量被声明为Base类型，引用Sub实例
        sub1.method();  //打印 method of Sub
        sub1.staticMethod();  //打印 static method of Base

        Sub sub2=new Sub();  //sub2变量被声明为Sub类型，引用Sub实例
        sub2.method();  //打印 method of Sub
        sub2.staticMethod();  //打印 static method of Sub
    }
}
class Base{
    void method(){
        System.out.println("method of Base");
    }
    static void staticMethod(){
        System.out.println("static method of Base");
    }
}