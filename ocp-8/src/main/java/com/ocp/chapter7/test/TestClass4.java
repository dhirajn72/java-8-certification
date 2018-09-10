/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7.test;

import java.util.concurrent.*;

/**
 * @author Dhiraj
 * @date 31/08/18
 */
public class TestClass4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();

        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<?> f1=service.submit(() -> {
            synchronized (o1) {
                System.out.println("Got o1");
                /*try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                synchronized (o2) {
                    System.out.println("Got o2");
                }
            }
        });
        Future<?> f2=service.submit(() -> {
            synchronized (o2) {
                System.out.println("Got o2");
                synchronized (o1) {
                    System.out.println("Got o1");

                }
            }
        });

        System.out.println(f1.get()+" "+f2.get());
        service.shutdown();
    }
}