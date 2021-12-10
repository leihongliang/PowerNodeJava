package javase.wrapperclass;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class integer3 {
    public static void main(String[] args) {
        int i = Integer.parseInt("123");
        System.out.println(i);//123
        double d = Double.parseDouble("3");
        System.out.println(d);//3.0
        //String-->int!!!
        int i1 = Integer.parseInt("100");
        System.out.println(i1+1);//101

        //int-->String
        String s1 = i1 + "";
        System.out.println(s1+1);//1001

        //int-->Integer
        Integer x = 100;//自动装箱

        //Integer-->int
        int y=x;//自动拆箱

        //String-->Integer
        Integer i2 = Integer.valueOf("100");

        //Integer-->String
        String s2 = String.valueOf(i2);

    }
}
