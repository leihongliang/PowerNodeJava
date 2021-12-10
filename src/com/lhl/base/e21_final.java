package com.lhl.base;

public class e21_final {
    public static void main(String[] args){
        final Users users = new Users(1);
        System.out.println(users.id);
        users.id = 2;
        System.out.println(users.id);
    }
    final int name = 21;
    final int age;
    public e21_final(){
        age=21;
    }





}
class D{
    public final void m1(){

    }
}
class E extends D{

}

//构造一个Users类
class Users {
    int id;

    public Users(int id){
        super();
        this.id = id;
    }
}
