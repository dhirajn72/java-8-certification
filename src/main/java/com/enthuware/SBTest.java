/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class SBTest {
    public static void main(String[] args) {
       String s= new StringBuilder("world").append("hello ", 0 , 6).toString();
        System.out.println(s);
    }
}
