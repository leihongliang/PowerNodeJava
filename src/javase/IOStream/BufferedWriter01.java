package javase.IOStream;

import java.io.*;

public class BufferedWriter01 {
    public static void main(String[] args) {
        try {
            //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("iostreamtest.txt",true)));
            FileWriter writer = new FileWriter("iostreamtest.txt",true);
            BufferedWriter out = new BufferedWriter(writer);
            out.write("import java.io.BufferedWriter;");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
