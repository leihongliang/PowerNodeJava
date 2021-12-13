package javase.IOStream;

import java.io.File;

public class FIle02 {
    public static void main(String[] args) {
        File f = new File("E:\\HDU\\Java\\学习");
        File[] files = f.listFiles();
        for (File file : files){
            System.out.println(file.getName());
        }
    }
}
