package javase.expection.homework;

public class UserService {
    public void register(String username,String password) throws IllegalNameException {
        if ( null == username || username.length()<6 || username.length()>14){
            throw new IllegalNameException("wrong format");
        }
        System.out.println("welcome");

    }

}
