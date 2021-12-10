package com.lhl.base;

public class e13_ObjectsAndMemory {
    public static void main(String[] args){
        House house = new House();
        System.out.println(house.name);
        house.name = "汤臣一品";

        Ren lhl = new Ren();
        lhl.name= "雷洪亮";
        house.owner = lhl;
        System.out.println(house.owner.name);
    }
}

class House{
    Ren owner;
    String name;
}

class Ren{
    String name;
    int age;
}
