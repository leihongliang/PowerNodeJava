public class supertest2 {
    public static void main(String[] args) {
        Vip vip = new Vip("lei_hl");
        vip.shopping();
    }
}

class AppCustomer{
    String name;

    public AppCustomer() {
    }

    public AppCustomer(String name){
        this.name = name;
    }
}
class Vip extends AppCustomer{
    String name;

    public Vip(){
    }
    public Vip(String name){
        super(name);
    }
    public void shopping(){
        System.out.println(this.name);//this表示当前对象的父类型特征
        System.out.println(super.name);//super表示的是当前对象的父类型特征（this指向的那个对象中的一个空间）
        System.out.println(name);
    }
}
/*
abstract class com.lhl.base.Animal{
    public abstract void move();
}
class Brid extends com.lhl.base.Animal{
}

 */