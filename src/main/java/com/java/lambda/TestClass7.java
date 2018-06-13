/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

/**
 * @author Dhiraj
 * @date 10/06/18
 */


public class TestClass7 implements Y {
    public static void methodX() throws Exception {
        throw new AssertionError();
    }

    public static void main(String[] args) {
        try {
           // methodX();
        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }

        Y y=new TestClass7();
        y.show();

    }
}


interface X{
    public default void show(){
        System.out.println("X");

    }
}

interface Y extends X{
    /*public default void show(){
        X.super.show();
        System.out.println("X");
        this.show();

    }*/
   // public void show();
}