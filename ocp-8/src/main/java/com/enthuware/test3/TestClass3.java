/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

/**
 * @author Dhiraj
 * @date 18/08/18
 */
public class TestClass3 {
    private static  int counter=0;

    public static void main(String[] args) {

        new Thread(()->{
            for (int i=0;i<5000;i++)
                TestClass3.counter++;
        }).start();

        while (TestClass3.counter<100){
            System.out.println("Not reached yet !!");
        }
        System.out.println("reached !!");
        System.out.println(counter);



    }
}
