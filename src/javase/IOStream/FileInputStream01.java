package javase.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建一个流，指定路径
            fis = new FileInputStream("E:\\HDU\\Java\\Learn\\exe\\iostreamtest.txt");
            // int readDate = fis.read();
            // System.out.println(readDate);//114 'r'字节码
            // System.out.println(fis.read());//101 'e'字节码

            /*
            while (true){
                int readDate = fis.read();
                if (readDate == -1){
                    break;
                }
                System.out.println(readDate);
            }*/

            //改进while
            int readData = 0;
            while ((readData = fis.read()) != -1){
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流不为空则关闭，确认流一定关闭
            if (fis != null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
             }
        }
    }
}
