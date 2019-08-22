/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 19/08/19
 */
public class Exception_1 {
    public static void main(String[] args) {

        try {
            throwException();
        }catch (java.lang.Exception e){
            System.out.println(e);
            System.out.println();
        }
        System.out.println(new StringBuilder("abcde").deleteCharAt(0));

    }

    private static void throwException() {
        if (true) {
            int x=10/0;
        }
    }
}
