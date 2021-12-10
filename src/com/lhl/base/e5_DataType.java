package com.lhl.base;/*

 */

/*
数据类型
1 不同的数据类型底层会分配不同大小的空间
2 数据类型的作用是指导系统在内存中为其开辟多大的空间
类型
1 整数型 byte    1 [-128~127] byte= 8 bit
        short   2
        int     4
        long    8
2 浮点型 float   4
        double  8
3 布尔型 boolean 1 [true/false]
4 字符型 char    2 [0~65535] 比起short有更大的正整数
        'com.lhl.base.a'  字符串“abc”不属于基本数据类型，属于“引用数据类型”，字符属于基本数据类型
 */
/*
成员变量没有手动赋值系统会自动赋值
局部变量则不会
 */
public class e5_DataType {
    static int k =1000;
    static int i ;
    public static void main (String[] args){
        System.out.println(k);
        System.out.println(i);
    }

}

 class charTest{
     public static void main (String[] args){
         char c = 'c';
         char a = '好';
         char b = '\n';
         char d = '\t';
         char e = '\\';
         System.out.println(c);
         System.out.println(a);
         System.out.println(b);//转义字符
         System.out.println(d);
         System.out.println(e);
              }
}
class intTest{
    public static void main (String[] args){
        int a = 10;
        int b = 010;
        int c = 0x10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        long e = 12345678910L ;

        System.out.println(e);
        int f = (int)e;//强制类型转换 可能会损失精度
        System.out.println(f);

        byte g = (byte)128;//0000000 00000000 00000000 10000000
        System.out.println(g);//强转后 原码 1000000  补码 01111111

    }
}

