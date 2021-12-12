package javase.IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            out = new FileWriter("FileWriter01");
            char[] chars = {'我','是','谁'};
            out.write(chars); // 我是谁
            out.write(chars, 0, 1); // 我是谁我
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
