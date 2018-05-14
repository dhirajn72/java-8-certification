/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 12/05/18
 */
public class Test1 implements Inter1 {

    public static void main(String[] args) {
        new Test1().go();
    }

    public void go(){
        System.out.println();
        Inter1.super.m1();
        m1();
        Inter1.m2();
    }

    //Default methods from interface always be overriden as public
    @Override
    public void m1() {

    }
}
