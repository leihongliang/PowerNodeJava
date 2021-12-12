package javase.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 拷贝文件，
 */
public class FileCopy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建输入输出流对象
            fis = new FileInputStream("iostreamtest.txt");
            fos = new FileOutputStream("iostreamtestcopy.txt");

            //一边读，一边写，每次最多拷贝1M
            byte[] bytes = new byte[1024*1024];
            int readCount = 0;
            // 读多少写多少，读到内存中，写到硬盘上
            while ((readCount = fis.read(bytes)) != -1){
                fos.write(bytes, 0, readCount);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                // 分开try
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
