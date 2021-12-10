package javase.expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest6 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("C:\\Users\\12040\\OneDrive\\图片\\壁纸");
    }
}
