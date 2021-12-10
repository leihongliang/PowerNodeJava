package javase.expection;

public class ExceptionTest1 {
    public static void main(String[] args) {
        NumberFormatException nfe = new NumberFormatException("wrong!");
        System.out.println(nfe);
    }
}