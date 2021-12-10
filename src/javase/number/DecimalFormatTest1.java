package javase.number;

import java.text.DecimalFormat;

public interface DecimalFormatTest1 {
    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat("###,###.##");
        String s =df.format(12.345);
        System.out.println(s);//12.35

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 =df2.format(12345.678);
        System.out.println(s2);//12,345.6780


    }
}
