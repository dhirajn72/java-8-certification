/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

/**
 * @author Dhiraj
 * @date 10/06/18
 */
public class TestClass4 {
    public static void main(String[] args) {
        GrandGrandParent c= new Child();
        c.show();
        System.out.println(c.x);
        System.out.println(((GrandParent)c).x);
        System.out.println(((Parent)c).x);
        System.out.println(((Child)c).x);


    }
}


class GrandGrandParent{
    int x=99;
    void show(){
        System.out.println("GrandGrandParent");
    }
}
class GrandParent extends GrandGrandParent{
    int x=98;
    void show(){
        System.out.println("GrandParent");
    }
}
class Parent extends GrandParent{
    int x=97;
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    int x=96;
    void show(){
        System.out.println("Child");
    }
}


