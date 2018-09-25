/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass29 {

    static int count;

    public static void main(String[] args) throws InterruptedException{

        new Thread(()->{for(int i=0;i<500;i++)TestClass29.count++;}).start();
        while (TestClass29.count<100) {
            System.out.println("Not reached yet !" + count);
           // Thread.sleep(1000);
        }
        System.out.println("Reached !!");


    }
}
