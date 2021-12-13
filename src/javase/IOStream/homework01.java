package javase.IOStream;

import java.io.*;

/**
 *  拷贝目录
 */
public class homework01 {
    public static void main(String[] args) {
        File srcFile = new File("E:\\HDU\\Java\\test\\root" );
        File destFile = new File("E:\\HDU\\Java\\test");
        copyDir(srcFile, destFile);
    }
    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(srcFile);
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\")+ srcFile.getAbsolutePath().substring(3);;
                out = new FileOutputStream(path);
                byte[] bytes = new byte[1024*1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return; // 非常关键
        }
        File[] files = srcFile.listFiles();
//        System.out.println(files.length);
        for (File file : files){
            if (file.isDirectory()){
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
                System.out.println(destDir);
            }
            copyDir(file, destFile);
        }
    }

}

