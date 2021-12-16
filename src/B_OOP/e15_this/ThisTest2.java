package B_OOP.e15_this;

public class ThisTest2 {
    public static void main(String[] args){
        doSome();
        ThisTest2.doSome();//调用方法

        ThisTest2 tt = new ThisTest2();//创建当前类的对象，main没有this
        ThisTest2.doSome();
        tt.run();
    }
    public static void doSome(){
        System.out.println("do some");
    }
    public void doOther(){
        System.out.println("实例方法");
    }

    public void run(){
        System.out.println("run是实例方法");
        this.doOther();
    }
}
