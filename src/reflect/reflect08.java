package reflect;

/**
 *  可变长度参数
 */
public class reflect08 {
    public static void main(String[] args) {
        m();
        m(1);
        m(1,2); // 可变长度参数
        m2(1,2); // 1 // 2
    }
    public static void m(int... args){
        System.out.println("可变长度参数");
    }
    // 可以被看做一个数组
    public static void m2(int... args){
        for (int i= 0; i< args.length; i++){
            System.out.println(args[i]);
        }
    }
}
