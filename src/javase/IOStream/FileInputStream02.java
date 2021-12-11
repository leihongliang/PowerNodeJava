package javase.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一次读取多个字节
 */
public class FileInputStream02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 相对路径，从当前所在路径作为起点
            // 默认当前路径是当前工程的根
            fis = new FileInputStream("iostreamtest.txt");
            // 创建一个byte数组，用来存放字节
            byte[] bytes = new byte[4];

            int readCount = fis.read(bytes);
            System.out.println(readCount);// 4
            System.out.println( new String(bytes));// read
            System.out.println("剩下可读字节数："+fis.available());


            readCount = fis.read(bytes);
            System.out.println(readCount);// 2
//            System.out.println( new String(bytes));// mead 只替换了前面两个
            System.out.println( new String(bytes, 0, readCount));// me
            System.out.println("剩下可读字节数："+fis.available());

            System.out.println(fis.read(bytes));// -1



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
