package javase.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // 自动新建一个output，存在则覆盖
            fos = new FileOutputStream("output");
            // 在此文件末尾追加
//            fos = new FileOutputStream("output",true);
            byte[] bytes = {97, 98, 99, 100};
            fos.write(bytes);// abcd
            fos.write(bytes, 0, 2);

            String s = "中文测试";
            byte[] zw = s.getBytes();
            fos.write(zw);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
