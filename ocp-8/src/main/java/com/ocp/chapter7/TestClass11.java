/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class TestClass11 {
    //private int sheepCount;
    private AtomicInteger sheepCount = new AtomicInteger(0);
    final static TestClass11 manager = new TestClass11();


    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            //TestClass11 manager = new TestClass11();
            for (int i = 0; i < 10; i++)
                // synchronized (manager) {
                service.submit(() -> manager.incrementAndReport());
            // }
        } finally {
            if (service != null) service.shutdown();
        }
    }

    private void incrementAndReport() {
        //System.out.println((++sheepCount)+"");
       // synchronized (this) {
        synchronized (manager) {
            System.out.println(sheepCount.incrementAndGet());
        }
    }
}