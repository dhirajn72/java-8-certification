/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 24/05/18
 */
public class StringTest3 {
    public static void main(String[] args) {

        String s2=new String("abc");
        String s1="abc";
        System.out.println(s1.equals(s2) +" "+(s1==s2));
        String s3=s1.intern();
        System.out.println(s1==s3);


    }
}
