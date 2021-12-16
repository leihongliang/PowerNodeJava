package B_OOP;

/*
tips
1 class com.lhl.base.recursion 递归的逻辑
在用一个作用域中，return语句下面不能编写任何代码
1 堆内存 new的对象，实例变量
2 栈内存 方法内存空间，局部变量（地址）
3 方法区内存 代码片段，静态变量

 */
public class e11_Method {
    public static void main(String[] args){
        e11_Method.sum(1,3);//实参
        sum(1,2);
        AA.m(1,2);
        chongzai.a(1);
        chongzai.a("zbc");
    }
    public  static void sum(int a ,int b){//形参
        int c = a + b;
        System.out.println(c);
    }
    public static void m(){
        System.out.println("ok");
    }
}

class AA{
        public static void  m(int a , int b){
            System.out.println("ok");
        }
}

class chongzai{
    public static void a(int a){
        System.out.println(a);
    }
    public static void a(String a){
        System.out.println(a);
    }

}

class recursion{
    public static void main(String[] args){
        System.out.println(sum(3));
    }
    public static int sum(int n){
        if(n==1){return 1;}
        return n + sum(n-1);
    }
}