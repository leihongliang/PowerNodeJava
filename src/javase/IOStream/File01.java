package javase.IOStream;

import java.io.File;
import java.io.IOException;

public class File01 {
    public static void main(String[] args) {

        File f1 = new File("E:\\HDU1");
        System.out.println(f1.exists()); //true
        if ((!f1.exists())) {
            try {
                f1.createNewFile();//以文件形式新建
                f1.mkdir();// 以文件形式新建
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File f2 = new File("E:/HDU2");
        System.out.println(f2.exists()); //true
        if (!f2.exists()) {
            f2.mkdir();// 以文件形式新建
        }

        // 获取父路径
        File f3 = new File("E:\\HDU\\Java\\学习\\JavaSE零基础讲义.pdf");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.getParent());
        System.out.println(f3.getParentFile());
        System.out.println(f3.getAbsolutePath());
    }
}
