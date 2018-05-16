/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 16/05/18
 */
public class TestSingleton {
    public static void main(String[] args)throws CloneNotSupportedException {
        Singleton s= Singleton.getInstace();
        System.out.println(s==s.clone());


    }
}
