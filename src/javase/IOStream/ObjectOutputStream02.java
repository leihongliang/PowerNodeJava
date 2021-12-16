package javase.IOStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStream02 {
    public static void main(String[] args) {
        try {
            List<User> userList = new ArrayList<>();
            userList.add(new User(1));
            userList.add(new User(2));
            userList.add(new User(3));
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(new FileOutputStream("File/ObjectOutputStream"));

            //一次序列化一个集合
            oos.writeObject(userList);
            oos.flush();
            oos.close();

            // 反序列化
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File/ObjectOutputStream"));
            List<User> userList1 = (List<User>) ois.readObject();
            for (User user : userList1){
                System.out.println(user);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
class User implements Serializable {
    int no;
    public User (int no){
        this.no = no;
    }
}