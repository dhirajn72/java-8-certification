/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class StaticInterfaceTest implements StaticInterface{
    public static void main(String[] args) {
        new StaticInterfaceTest().show();
    }
    void show(){
        System.out.println(meltingPoint());  // Interface default method can be directly called from subclass implementing it
        System.out.println(StaticInterface.super.meltingPoint()); // This is another way of calling Interface default method
        //System.out.println(boilingPoint()); // This is not allowed because, the method does not belongs to object, it belongs to Type(StaticInterface)
        System.out.println(StaticInterface.boilingPoint()); // Valid, this is the correct way to call static interface.
    }
}

interface StaticInterface{
    static int boilingPoint(){
        return 100;
    }
    default int meltingPoint(){
        return 0;
    }
}

class SuperOverideTest{
    int m1(){
        return 10;
    }
}

class SubOverideTest extends SuperOverideTest{


    //char m1() { // this is invalid, you can't modify the overriden method's signature !
    int m1(){
        return 's'; // Covarient return with primitives, char can be returned from ovverden method.
    }
}
