/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 16/05/18
 */
public class Test3 {
    public static void main(String[] args) {

        //Integer i1=127;
        //Integer i2=127;

        Boolean i1=false;
        Boolean i2=false;

        if (i1 != i2)
            System.out.println("Not equal!!");
        if(i1 == i2)
            System.out.println("equal objects!!");

    }
}

interface Inter3{
    int operation(int a,int b);
}
