package javase.expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest4 {
    public static void main(String[] args) {
        try{
            //创建输入流
            FileInputStream fis = new FileInputStream("");
        }catch (FileNotFoundException e){
            //IOException也可以 多态
            //FileInputStream(File file) throws FileNotFoundException
            System.out.println("wenjian bucunzai");
        }catch (Exception e){
            System.out.println();
        }
    }
}
