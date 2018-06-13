/*
 * All Rights Reserved @Dhiraj
 */

package com.java.test;

/**
 * @author Dhiraj
 * @date 13/06/18
 */

class A {
    public int i = 10;
    private int j = 20;
}

class B extends A {
    public int k = 40;
    private int i = 30;
}

class C extends B {
}

public class TestClass {
    public static void main(String args[]) {
        C c = new C();
        //System.out.println(c.i);
        //System.out.println(c.j);
        System.out.println(c.k);
    }
}