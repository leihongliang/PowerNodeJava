package javase.IOStream;

import java.io.*;

public class DataInputStream01 {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("Dataoutput"));
            // System.out.println(dis.readInt());
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
