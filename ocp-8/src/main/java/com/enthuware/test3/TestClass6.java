/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

/**
 * @author Dhiraj
 * @date 19/08/18
 */

public class TestClass6 implements Runnable {
    int x = 0, y = 0;

    public static void main(String[] args) {
        TestClass6 tc = new TestClass6();
        new Thread(tc).start();
        new Thread(tc).start();
    }

    public void run() {
        while (true) {
            synchronized (this) {
                x++;
                y++;
                System.out.println(" x = " + x + " , y = " + y);
            }
        }
    }
}