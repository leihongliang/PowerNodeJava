package B_OOP;

/*
构造函数（构造函数，构造器）
1   普通方法
    [修饰符列表] 返回值类型 方法名（形参列表）{
        方法体；
    }
    有static 类名.方法名（实参列表）
    无static 引用.方法名(实参列表)

    构造方法（void都不能加）
    [修饰符列表] 构造方法名（形参列表）{
        构造方法体；
    }
    new 构造方法名（实参列表） e.g. new 类名（）
2 构造方法名必须和类名保持一致
3 作用：通过构造方法的调用，可以创建对象
4 返回值不用写，返回值类型永远是自己
5 方法的重载 多个User02
6 以下创建了两个对象，只要构造的函数调用就会创建对象（堆内存）
    Student s = new Student（）new后面是一个构造方法的方法名
 */
 public class e15_Constructor {
    public static void main(String[] args){
        User02 u = new User02(); // new 构造方法名（实参列表），返回值类型User02
        new User02();
        User02 u2 = new User02(2);

        User03();

        e15_Constructor x = new e15_Constructor(); // 先创建对象
        x.User04();
    }
    public static void User03(){
        System.out.println("我是普通方法,调用有static的方法，使用类名.");
    }
    public void User04(){
        System.out.println("我是普通方法，调用无static的方法，使用引用.，先创建对象");
    }
}

class User02{
     //无参数构造方法
    public User02(){
        System.out.println("");
    }
    //有参数构造方法
    public User02(int i){
        System.out.println("带有int类型的构造器");
    }
}

//class 2
class  Constructor{
     public static void main(String[] args) {
         // 创建方法
         Account act1 = new Account();
         System.out.println(" actcount = "+ act1.getActno());
         System.out.println(" balance = " + act1.getBalance());
     }
}

class Account{
     private String actno;
     private double balance;

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


