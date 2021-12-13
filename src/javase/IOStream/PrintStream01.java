package javase.IOStream;

import java.io.PrintStream;

public class PrintStream01 {
    public static void main(String[] args) {
        System.out.println("hello");
        PrintStream ps = System.out;
        ps.println("hello");
    }
}
