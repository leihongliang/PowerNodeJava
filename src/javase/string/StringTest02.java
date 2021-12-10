package javase.string;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "abc";
        byte[] bytes ={97,98,99};
        String s2 = new String(bytes);
        System.out.println(s2);
        System.out.println(s2.toString());

    }
}
