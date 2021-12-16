package B_OOP.e24_Object;

public class objecttest04 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4);//false 是内存地址
        System.out.println(s1 == s3);//false
        System.out.println(s3.equals(s4));

    }
}
