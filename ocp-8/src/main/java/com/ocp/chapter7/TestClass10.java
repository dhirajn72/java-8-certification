/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 13/07/18
 */
public class TestClass10 {
    public static int counter;

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(50);
        System.out.println("#####################");
        System.out.println(Runtime.getRuntime().availableProcessors());
        try {

            scheduler.scheduleAtFixedRate(() -> {
                System.out.println(counter++);
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getId() + " scheduleAtFixedRate:    " + new Date());
                try {
                    System.out.println(Runtime.getRuntime().availableProcessors());
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, 5, 3, TimeUnit.SECONDS);
            /*scheduler.scheduleWithFixedDelay(() -> {
                System.out.println(counter++);
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getId() + " scheduleWithFixedDelay: " + new Date());
            }, 10, 1, TimeUnit.SECONDS);*/
        } finally {
            // if (scheduler!=null)scheduler.shutdown();
        }
        System.out.println("***************");
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}