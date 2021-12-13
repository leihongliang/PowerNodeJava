package javase.IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
    public static void main(String[] args)  {
        FileReader reader = null;// 节点流
        try {
            reader = new FileReader("iostreamtest.txt");
            // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做节点流
            // 外部负责包装的流，叫做包装流/处理流
            BufferedReader br = new BufferedReader(reader);// 包装流
            String txt = br.readLine();// 不会读取换行符
            System.out.println(txt);

            br.close();// 会自动关闭节点流

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
