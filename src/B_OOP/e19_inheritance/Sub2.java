package B_OOP.e19_inheritance;

class Base2 {
    private String showMe() {
        return "Base";
    }
    public void printBase(){
        System.out.println(showMe());  //到底调用Base类的showMe()还是Sub类的showMe()?
    }
}
public class Sub2 extends Base2 {
    public String showMe(){
        return "Sub";
    }
    public void printSub(){
        System.out.println(showMe());  //到底调用Base类的showMe()还是Sub类的showMe()?
    }
    public static void main(String args[]){
        Sub2 sub=new Sub2();
        sub.printBase();
        sub.printSub();
    }
}


