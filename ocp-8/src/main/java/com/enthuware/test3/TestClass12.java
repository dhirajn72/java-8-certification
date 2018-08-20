/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass12 {
    public static void main(String[] args) {
        doIt(()->{
            System.out.println("doIt implementation");
            int i=0;
            int j=99;
            System.out.println(i+j);
            return i+j;
        });
    }
    public static void doIt(Inter i){
        i.m1();
    }
}

@FunctionalInterface
interface Inter{
    int m1();
}