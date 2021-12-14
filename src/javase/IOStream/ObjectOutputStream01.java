package javase.IOStream;

import java.io.*;

public class ObjectOutputStream01 {
    public static void main(String[] args) {
        Student s = new Student(1);
        try {
            // 序列化
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ObjectOutputStream"));
            oos.writeObject(s);

            // 反序列化
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjectOutputStream"));
            Object obj = ois.readObject();
            System.out.println(obj);// javase.IOStream.Student@312b1dae
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Student implements Serializable {
    int no;
    public Student (int no){
        this.no = no;
    }
}