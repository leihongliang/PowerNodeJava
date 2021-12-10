package javase.expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest7 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\");
            String s = null;
            s.toString();//空指针异常
            System.out.println("not appear");//not execution
            //流使用完需要关闭，流是占用资源的
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("show up");//execution
            if (fis != null) {
                try {
                    //close()方法有异常，采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("hello world");//execution
    }
}
//show up
//hello world