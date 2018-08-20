/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

/**
 * @author Dhiraj
 * @date 19/08/18
 */
public class TestClass8 extends Thread {
    static Object obj1 = new Object();
    static Object obj2 = new Object();

    public static void main(String[] args) {
        new TestClass8().start();
        new TestClass8().start();
    }

    public void m1() {
        synchronized (obj1) {
            System.out.print("1 ");
            synchronized (obj2) {
                System.out.println("2");
            }
        }
    }

    public void m2() {
        synchronized (obj2) {
            System.out.print("2 ");
            synchronized (obj1) {
                System.out.println("1");
            }
        }
    }

    public void run() {
        m1();
        m2();
    }
}