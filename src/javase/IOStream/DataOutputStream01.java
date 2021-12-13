package javase.IOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream01 {
    public static void main(String[] args) {
        try {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("DataOutput"));
        dos.writeInt(100);
        dos.writeInt(200);
        dos.writeBoolean(true);
        dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
