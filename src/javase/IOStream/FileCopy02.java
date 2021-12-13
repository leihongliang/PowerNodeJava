package javase.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("iostreamtest.txt");
            out = new FileWriter("iostreamtestcopy2.txt");

            char[] chars = new char[4];
            int readCount = 0;
            while ((readCount = in.read(chars)) != -1) {
                out.write(chars, 0, readCount);
            }
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
