package B_OOP.e23_interface;

public class interface01 {
    public static void main(String[] args) {
        System.out.println(Mymath.Pi);
//        B_OOP.e23_interface.Mymath.Pi = 3.2;
        Mymath mm = new Mymathimpl();//父类型的引用指向子类型的对象
        int result = mm.sum(1,2);
        System.out.println(result);
    }
}

interface Mymath{
//    public abstract int sum(int com.lhl.base.a,int com.lhl.base.b );
    public static final double Pi = 3.14;//常量
    int sum(int a,int b);//抽象方法
//    void doSome(){
//
//    };
}
class Math{

}
//Method 1
//abstract class B_OOP.e23_interface.Mymathimpl implements B_OOP.e23_interface.Mymath{}

//Method 2
class Mymathimpl implements Mymath{
    public int sum(int a,int b){
        return a+b;
    }
}
