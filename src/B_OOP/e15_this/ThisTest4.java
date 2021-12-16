package B_OOP.e15_this;/*
tips
this()
    line 23!!!一个构造方法调用另一个构造方法，不用创建new对象就鞥调用对象
    this. 实例方法，代表当前对象
    this() 构造方法，代用其他构造方法，只能出现在第一行
 */

public class ThisTest4 {
   private int year;
   private int month;
   private int day;

    // 构造函数,创建了一个Date（B_OOP.e15_this.ThisTest4）对象
    public ThisTest4(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //构造无参
    public ThisTest4(){
//        this.year = 1970;
//        this.month = 01;
//        this.day = 01;
//        B_OOP.e15_this.ThisTest4 tt = new B_OOP.e15_this.ThisTest4(1970,1,1); 错了！！！
        this(1970,1,1);
    }

    //setter and getter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void print(){
        System.out.println(this.year +"年"+ this.month +"月"+this.day+"日");
    }
}

class DataTest{
    public static void main(String[] args){
        ThisTest4 tt = new ThisTest4();
        ThisTest4 tt2 = new ThisTest4(1999,06,8);
        tt.print();
        tt2.print();
    }
}