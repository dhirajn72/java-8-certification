/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 05/09/18
 */
// Java program to explain the
// concept of joining a thread.

// Creating thread by creating the
// objects of that class
class ThreadJoining extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has" +
                        " been caught" + ex);
            }
            //System.out.println(i);
        }
    }
}

public class GFG {
    public static void main(String[] args) {
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
        t1.start();
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t1.join();
            System.out.println("Current Thread(main): "
                    + Thread.currentThread().getName());
        } catch (Exception ex) {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }
        t2.start();
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t2.join();
            System.out.println("Current Thread(main): "
                    + Thread.currentThread().getName());
        } catch (Exception ex) {
            System.out.println("Exception has been" +
                    " caught" + ex);
        }
        t3.start();
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t3.join();
            System.out.println("Current Thread(main): "
                    + Thread.currentThread().getName());
        } catch (Exception ex) {
            System.out.println("Exception has been" +
                    " caught" + ex);
        }
        System.out.println("main terminating !!");
    }
}
