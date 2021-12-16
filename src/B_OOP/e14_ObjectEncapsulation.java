package B_OOP;

/*
面对对象
1 封装
2 继承
3 多态

set和get两个方法
 */
public class e14_ObjectEncapsulation {
    public static void main(String[] args){
        User user01 = new User();
        System.out.println(user01.age);
        user01.age = -100; //建议User类封装，外部程序不能随意访问User对象中的属性
        System.out.println(user01.age);
//        System.out.println(user01.age02);
        user01.setAge02(-100);
        System.out.println(user01.getAge02());
    }
}

//public void setAge (int com.lhl.base.a){
//    age = com.lhl.base.a;
//}
//public void getAge ( ){
//    return age;
//}