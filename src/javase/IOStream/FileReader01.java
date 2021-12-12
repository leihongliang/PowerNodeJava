package javase.IOStream;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.DoubleToIntFunction;

public class FileReader01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("output");
            char[] chars = new char[4];
            int readCount = 0;
            reader.read(chars);
            for (char c : chars){
                System.out.println(c);
            }
            /*while ((readCount = reader.read(chars)) != -1){
                System.out.println(readCount);
                System.out.println(chars);
                System.out.println(new String(chars, 0, readCount));
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
