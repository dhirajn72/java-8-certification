/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

/**
 * @author Dhiraj
 * @date 25/08/18
 */

public class MyThread implements Runnable {
    String msg = "default";

    public MyThread(String s) {
        msg = s;
    }

    public static void main(String args[]) {
        new Thread(new MyThread("String1")).run();
        new Thread(new MyThread("String2")).run();
        System.out.println("end");
    }

    public void run() {
        System.out.println(msg);
    }
}