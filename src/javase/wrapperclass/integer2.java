package javase.wrapperclass;

public class integer2 {
    public static void main(String[] args) {
        System.out.println("int max"+Integer.MAX_VALUE);// 2147483647
        System.out.println("int min"+Integer.MIN_VALUE);// -2147483648
        System.out.println("byte max"+Byte.MAX_VALUE);//127
        System.out.println("byte min"+Byte.MIN_VALUE);//-128

        //自动装箱，自动拆箱
        Integer x = 100;
        int y =   x;

    }
}
