/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 16/05/18
 */
public class Test4 {
    public static void main(String[] args) {

        //System.out.println(Integer.valueOf("122.23")); //Illegal
        //System.out.println(Integer.valueOf("122.23f")); //Illegal
        //System.out.println(Integer.valueOf("122.23D")); //Illegal
        System.out.println(Integer.valueOf("122")); //Legal
        System.out.println(Float.valueOf("122.32D")); //Legal, similar to below statement
        float f=(float) 122.32d; // in case of wrapper class compiler does already as above , but for primitive, needs to be done explicitly.
        System.out.println(f);
    }
}
