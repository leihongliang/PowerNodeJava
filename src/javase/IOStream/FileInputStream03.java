package javase.IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("iostreamtest.txt");
            byte[] bytes = new byte[4];
            /*while (true){
                int readCount = fis.read(bytes);
                if (readCount == -1){
                    break;
                }
                System.out.println(new String(bytes,0, readCount));
            }*/
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
