/*
this是一个关键字
this是一个引用，一个变量，this变量中【保存了内存地址指向自身】，this存储在堆内存 java对象内部
每一个对象都有this
this为当前执行这个行为/动作的对象
this多数情况下可以省略不写
this不能使用在带有static的方法当中

没有static关键字的方法称为 【实例方法】必须采用，创建对象 ” 引用. “ 的方式访问 （有的使用 类名. ）
没有static关键字的变量称为 【实例变量】必须采用，创建对象 ” 引用. “ 的方式访问 （有的使用 类名. ）


属性 状态
方法 行为和动作 this为当前执行这个行为/动作的对象

一个行为/动作,需要对象参与则要定义为"实例方法"
 */
public class CustomerTest {
    public static void main(String[] args){
        Customer2 c1 = new Customer2();
        c1.name = "lhl";
        c1.shopping();

        Customer2 c2 = new Customer2();
        c2.name = "lhl2";
        c2.shopping();

        Customer2.dosome();

    }

    public void shopping(){
    }
}
