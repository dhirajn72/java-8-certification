package com.enthuware.test2;

/**
 * @author Dhiraj
 * @date 26/08/18
 */

class MyRunnable implements Runnable {
    MyRunnable(String name) {
        new Thread(this, name).start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class TestClass21 {
    public static void main(String[] args) {
        Thread.currentThread().setName("MainThread");
        MyRunnable mr = new MyRunnable("MyRunnable");
        mr.run();
    }
}