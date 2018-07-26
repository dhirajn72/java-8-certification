/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

/**
 * @author Dhiraj
 * @date 24/07/18
 */
public class TestClass12 {
    public static void main(String[] args) {
        Integer[] ob=new Integer[1];
        Object ob2=new Integer[1];

        Object[] ob1=new String[1];

        System.out.println(ob1[0]);
        System.out.println(ob instanceof Integer[]);
        System.out.println(ob1 instanceof String[]);
        Object[] ob3=ob;
        ob3[0]="test";

    }
}
