package javase.string;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTest03 {
    public static void main(String[] args) {
        char c = "china".charAt(1);
        System.out.println(c);

        int result1 = "abc".compareTo("abc");
        System.out.println(result1);//0 相等
        int result2 = "abcd".compareTo("abce");
        System.out.println(result2);//-1 8-9=-1 前小后大
        int result3 = "abcd".compareTo("abcb ");
        System.out.println(result3);//2 8-6=2 前大后小
        int result4 = "abc".compareTo("bcasdfsdfd");
        System.out.println(result4);//-1 字符串第一个字母比较，分出胜负就不比了

        System.out.println("abcd".contains("bc"));
        System.out.println("abcd".endsWith("cd"));
        System.out.println("abcd".equals("abcd"));
        System.out.println("abcd".equalsIgnoreCase("Abcd"));

        byte[] bytes ="abc".getBytes();
        System.out.println(Arrays.toString(bytes));

        System.out.println("abcdef".indexOf("b"));//1
        System.out.println("abc".isEmpty());//false
        System.out.println("abc".length());//3
        System.out.println("aaajava".lastIndexOf("java"));//3
        System.out.println("aaajava".replace("java","pyhton"));//aaapython

        String split[] ="a-b-c".split("-");
        System.out.println(Arrays.toString(split));//[a, b, c]

        System.out.println("abcdefg".substring(1,3));//bc

        char tochar[] = "abcd".toCharArray();
        System.out.println(Arrays.toString(tochar));//[a, b, c, d]

        System.out.println(" a b c ".trim());//a b c

        String s1 = String.valueOf(123);
        System.out.println(String.valueOf(true));//true
        System.out.println(String.valueOf(123));//123
    }
}
