package com.lhl.base;

public class e8_switch {
    public static void main(String[] args){
         java.util.Scanner s = new java.util.Scanner(System.in);
         int num = s.nextInt() ;
         switch (num) {
             case 1: case 2:
                 System.out.println("1");
                 break;
             default:
                 System.out.println("wrong!!!");
         }
    }
}

class test{
    public static void main(String[] args){
        java.util.Scanner a = new java.util.Scanner(System.in);
        int aa = a.nextInt();
        String bb = a.next();
        int cc = a.nextInt();
        System.out.println(aa+bb+cc);
        switch (bb){
            case"+":
                System.out.println(aa+cc);
                break;
            case"-":
                break;
            case"*":
                break;
            case"？":
                break;
        }
    }
}