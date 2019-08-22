/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

/**
 * @author Dhiraj
 * @date 04/06/19
 */
public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
    public static void main(String[] args) throws InterruptedException {
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        //thread1.join(); //wait for thread 1 to terminate
        //thread2.join(); //wait for thread 2 to terminate
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            threadLocal.set((int) (Math.random() * 100));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            System.out.println(threadLocal.get());
        }
    }

}