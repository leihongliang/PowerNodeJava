package com.lhl.base;

import com.sun.org.apache.xpath.internal.objects.XString;
import java.util.Scanner;

/*
选择结构 if if..else switch
循环结构 for while  do..while
控制循环的语句 break continue
 */
/*
tips
1 if语句只要有一个分支执行,整个if语句全部结束
2 equals.()
3 boolean
 */
public class e7_if {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("age？");
        int age = s.nextInt();
        System.out.println("input:" + age);

        String str = "老年";
        if (age< 0 || age> 150){
            str = "wrong!!!";
        }else if( age <= 5){
            str = "幼儿";
        }else if( age <= 10){
            str = "少儿";
        }else if( age <= 18){
            str = "青少年";
        }else if( age <= 35){
            str = "青年";
        }else if( age <= 55){
            str = "中年";
        }
        System.out.println(str);
    }
}

class weather{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("com.lhl.base.weather?");
        String weather = s.nextLine();
        Scanner g = new Scanner(System.in);
        System.out.print("gender?");
        String gender = g.nextLine();
        Scanner t = new Scanner(System.in);
        System.out.print("temperature?");
        int temperature = t.nextInt();
        System.out.println(weather == gender);


        if (weather.equals("rain")){
            if (gender.equals("man")){
                System.out.println("带一把大黑伞");
            }else if (gender == "woman"){
                System.out.println("带一把大黑伞");
            }
        }
        else if(weather == "sunny"){
            if( temperature > 30 ){
                if (gender == "woman" ){
                    System.out.println("防晒");
                }
            }

        }
        else System.out.println("wrong!!!");
    }
}