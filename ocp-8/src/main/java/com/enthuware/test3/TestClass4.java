/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

/**
 * @author Dhiraj
 * @date 19/08/18
 */

public class TestClass4 extends Thread {
    static int x, y;

    public static void main(String[] args) {
        new TestClass4().start();
        new TestClass4().start();
    }

    public synchronized void run() {
        for (; ; ) {
            x++;
            y++;
            System.out.println(x + " " + y);
            System.out.println(Thread.currentThread().getId()+"::"+Thread.currentThread().getName());
        }
    }
}