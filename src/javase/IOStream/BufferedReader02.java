package javase.IOStream;
import java.io.*;
/**
 *  转换流
 */
public class BufferedReader02 {
    public static void main(String[] args) {
        try {
            // 字节流
            FileInputStream fis = new FileInputStream("iostreamtest.txt");

            // 字节流 转换为 字符流
            // fis是节点流，reader是包装流
            InputStreamReader reader = new InputStreamReader(fis);

            // reader是节点流，br是包装流
            BufferedReader br = new BufferedReader(reader);

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
