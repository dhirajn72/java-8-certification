/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 22/05/18
 */
public class Test {

    static {
        int x=50;
        //x=x/0;

    }

    /*{
        int x=50;
        x=x/0;
    }*/


    public static void main(String[] args) {
        final int x = 0;
        int y = 6;
        y += 7;
        System.out.println(x + " " + y);
        int z = (int) 123456L;
        System.out.println(z);
        new Test();
        throw new Error();
    }
}
