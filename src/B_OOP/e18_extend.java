package B_OOP;

/*

 */
public class e18_extend {
    public static void main(String[] args){
        C c = new C();
        c.doSome();
    }
}

class A{
    public void doSome(){
        System.out.println("dosome");
    }
}
class B extends A{

}
class C extends B{

}