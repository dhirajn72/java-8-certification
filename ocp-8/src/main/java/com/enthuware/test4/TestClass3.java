/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

/**
 * @author Dhiraj
 * @date 24/08/18
 */
public class TestClass3 implements Runnable {
    volatile int x;

    public void run() {
        x = 5;
    }
    public static void main(String[] args) {
        TestClass3 tc = new TestClass3();
        tc.x = 10;
       // for (int i=0;i<10;i++){
            new Thread(tc).start(); // 1

        /*try {
            Thread.sleep(50);
        }catch (InterruptedException e){e.printStackTrace();}*/
            System.out.println(tc.x);
        //}
    }
}