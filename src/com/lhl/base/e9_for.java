package com.lhl.base;/*
tips
  1 可以访问作用域中的i变量
 */

public class e9_for {
    public static void main(String[] args){
        int i=0;
        for ( ; i<10 ;i++){
            System.out.println(i);
        }
        System.out.println(i);// i 可以访问for循环
    }
}
class test2 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0;i <= 100; i++){
            if( i%2 == 1 ){
                System.out.println(i);
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
class test3{
    public static void main(String[] args){
        int i=1;
        for ( ;i<=9;i++){
            for(int k=i; k>0; k--){
                System.out.println(i+"*"+k+"="+i*k);
            }
            System.out.println("\t");
        }
    }
}
class sushu1{
    public static void main(String[] args){
        for (int i = 2; i<=100; i++){
            int flag= 0;
            for(int k =1; k<= i; k ++) {
                if(i% k==0) flag += 1 ;
            }
            if (flag==2)System.out.println(i);
        }
    }
}
class sushu2{
    public static void main(String[] args){
        for (int i = 2; i<=100; i++){
            boolean sushu= true;
            for(int k =2; k< i; k ++) {
                if(i% k==0) sushu = false ;
            }
            System.out.println(sushu ? i+"是素数": i+"不是素数" );
        }
    }
}