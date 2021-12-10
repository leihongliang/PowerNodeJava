package javase.wrapperclass;

public class test3 {
    public static void main(String[] args) {
        Integer a =1000;//Integer a = new Integer(1000)
        Integer b =1000;//Integer b = new Integer(1000)
        System.out.println(a==b);//false，两者内存地址不同
        // 双等号比较的是对象内存地址，不会拆箱

        Integer x = 127;
        Integer y = 127;
        System.out.println(x==y);//true

    }
}
