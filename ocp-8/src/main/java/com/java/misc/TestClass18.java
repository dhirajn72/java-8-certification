/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dhiraj
 * @date 25/09/18
 */
public class TestClass18 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        final AtomicInteger atomicInteger = new AtomicInteger();
        service.scheduleAtFixedRate(() -> {
            System.out.println(atomicInteger.incrementAndGet());
        }, 1,1, TimeUnit.SECONDS);


    }
}