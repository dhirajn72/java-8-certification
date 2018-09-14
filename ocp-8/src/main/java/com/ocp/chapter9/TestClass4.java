/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

/**
 * @author Dhiraj
 * @date 12/09/18
 */
public class TestClass4 {
    public static void main(String[] args) {

    }
}

interface I1{
    default void walk(){

    }
    static void walk1(){
        System.out.println("I1 static");
    }
}
interface  I2{
    default void walk(){

    }
    static void walk1(){
        System.out.println("I2 static");
    }
}

interface I3 extends I1,I2{
    default void walk(){
        System.out.println("I3 walk");

    }
}