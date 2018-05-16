/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 15/05/18
 */
public class StringTest {
    public static void main(String[] args) {

        String s1="cat";
        String s2="cat";
        String s3= new String("cat");
        String s4=s3;
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s2==s3);

        System.out.println("******");
        System.out.println(s1.toString());
        System.out.println(s1);

        StringBuilder sb= new StringBuilder("abc");
        sb.insert(0,"---").reverse().insert(6,"xyz");
        System.out.println(sb);
        StringBuilder sb2= new StringBuilder();
        //sb2.insert(2,"abc");
        //System.out.println(sb2.charAt(0));
        System.out.println(sb2);
        int x=5;
        StringBuilder sb3= new StringBuilder(x);
        sb3.insert(0,"abc");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        sb3.insert(3,"abc");
        System.out.println(sb3+" "+sb3.indexOf("c"));
        System.out.println("******");


    }
}
