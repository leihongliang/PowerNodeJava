package B_OOP;

public class e16_ParameterPassing {
    public static void main(String[] args){
        int i=10;//局部变量 i变量本身有内存地址，i变量保存的是10这个字面值
        add(i);//传递的是10这个字面值（被复制过来）
        System.out.println("main-->"+i);//弾栈后，啥也不剩

        User03 u = new User03(20);
        add02(u);//u本身有内存地址，为局部变量，保存的值是一个内存地址（和上面的10相同）
        System.out.println("add -->"+u.age);
    }
    public static void add02(User03 u){
        u.age++;
        System.out.println("add -->"+u.age);
    }

    public static void add(int i){//形参局部变量
        i++;
        System.out.println("add -->"+i);
    }

}
class User03{
    int age;

    //构造方法
    public User03(int i){
        age = i;
    }
}