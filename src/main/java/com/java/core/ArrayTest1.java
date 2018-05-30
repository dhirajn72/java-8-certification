/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 25/05/18
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //int[] arr=new int[2]{2,1}; //Illegal, you can't provide size while compile time initialization
        int[][] ints = new int[2][];
        //int[] ints1=new int[-3];
        //ints.length=ints.length+1; //length is a final variable, cannot be modified.
        System.out.println(ints.length);
        int x='A';
        System.out.println(x);

        Integer i1=23;
        Long l1=23L;
        System.out.println(l1.equals(i1));
        Character c1='A';
        Character c2='B';
        System.out.println(c1.equals(i1));
    }
}
