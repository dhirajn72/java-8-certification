/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

/**
 * @author Dhiraj
 * @date 21/07/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        X x=new Y();
        x.m1();
    }
}

class X{
   public static void m1(){
        System.out.println("X");
    }
}
class Y extends X{

    //@Override
   public  static void m1() {
        System.out.println("Y");
    }
}