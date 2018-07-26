/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

/**
 * @author Dhiraj
 * @date 22/07/18
 */
public class TestClass4 {
    public static void main(String[] args) {
        print((x)-> System.out.println(x-1),6); // without body
        print((x)-> {System.out.println(x-2);},6);// with body
        print((x)-> {System.out.println(x);
            System.out.println(x+x);
            System.out.println(x+x);
            },6);// with body, with multi-statement
    }

    private static void print(Inter4 ob,int x){
        ob.m1(x);
    }

}

/**
 * output of above code:
 * 5
 * 4
 * 6
 * 12
 * 12
 *
 */


@FunctionalInterface
interface Inter4{
    void m1(int x);
}