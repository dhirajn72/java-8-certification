/*
 * All Rights Reserved @Dhiraj
 */

package com.java.literals;

/**
 * @author Dhiraj
 * @date 05/06/18
 */
public class Test3 {
    static int x=1;
    public static void main(String[] args) {
        new Test3().print(x);
        System.out.println(0/x);

    }
    public void print(int y){
        if (y!=100){
            System.out.println(y++);
            print(y);

        }
    }
}
