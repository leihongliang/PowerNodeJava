package javase.expection.homework;

public class test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register(null,"123");
        } catch (IllegalNameException e) {
            e.printStackTrace();
        }
    }
}
