/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 10/09/18
 */
public class Deadlock1 {
    static  Object ob1= new Object();
    static  Object ob2= new Object();
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(4);
        Runnable thread1=()->{
            synchronized (ob1){
                sleep();
                System.out.println("Locked ob1::");
                synchronized (ob2){
                    System.out.println("Locked ob2::");
                }
            }
        };
        Runnable thread2=()->{
            synchronized (ob2){
                sleep();
                System.out.println("Locked ob2::");
                synchronized (ob1){
                    System.out.println("Locked ob1::");
                }
            }
        };

        service.submit(thread1);
        service.submit(thread2);
        service.shutdown();
    }

    private static void sleep() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
