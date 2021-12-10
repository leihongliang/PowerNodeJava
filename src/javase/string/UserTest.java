package javase.string;

public class UserTest {
    public static void main(String[] args) {
        User user = new User(110,"zhangsan");
        String s1= "hello";
        String s2= "hello";
        System.out.println(s1 == s2);

        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("xyz".equals(x));

    }
}
