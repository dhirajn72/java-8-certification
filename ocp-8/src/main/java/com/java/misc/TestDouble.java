/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 07/10/19
 */
public class TestDouble {
    public static void main(String[] args) {

        double d1=99.9900;
        double d2=100.00009;
        double criteria = 0.00009;

        if(Math.abs(d1-100) <= criteria){
            System.out.println("Success");
            System.out.println(d1-100);
            System.out.println(Math.abs(d1-100));

        }


        System.out.println(d1<=d2);


    }
}
