/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 18/12/19
 */
public class ThreadTest {
    public static void main(String[] args) {
        A1 a=new B1();
        //a.m1("hello");
    }
}

class A1{
     protected synchronized void m1(String s){
        System.out.println("A1-m1()");
    }
}

class B1 extends  A1{

    @Override
    public synchronized void m1(String i) {
        System.out.println("B1-m1()");
    }
}