/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.*;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass30 {
    static  int count;
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService service= Executors.newSingleThreadExecutor();
        Future future=service.submit(()->{for (int i = 0; i<500000; i++)TestClass30.count++;});

        future.get(1, TimeUnit.NANOSECONDS);
        System.out.println("Reached !!");
        service.shutdown();
    }
}
