package javase.expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest3 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            System.out.println("right");
        } catch (FileNotFoundException e) {
            //e引用保存的内存地市是之后new出来的
            System.out.println("wrong");
            System.out.println(e);//java.io.FileNotFoundException: E:\HDU11 (系统找不到指定的文件。)
        }
        System.out.println("main over");

    }
    //throws FileNotFoundExceptiohn 其父类也可以
    private static void m1() throws FileNotFoundException{
        System.out.println("m1 begin");
        m2();
        //以上代码出现异常，这里不会运行
        System.out.println("m1 over");
    }
    private static void m2() throws FileNotFoundException{
        System.out.println("m2 begin");
        m3();
        //以上代码出现异常，这里不会运行
        System.out.println("m2 over");
    }
    private  static void m3() throws FileNotFoundException {
        System.out.println("m3 begin");
        new FileInputStream("E:\\HDU11");
        System.out.println("m3 over");
    }
}
//main begin
//m1 begin
//m2 begin
//m3 begin
//wrong
//main over