package javase.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStream01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\HDU\\Java\\Learn\\exe\\iostreamtest.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
