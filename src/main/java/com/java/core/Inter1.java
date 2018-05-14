/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 12/05/18
 */
public interface Inter1 {
    default void m1(){
        System.out.println("Inter1-m1()");
    }

    static void m2(){
        System.out.println("Inter1-m2()");
    }
}
