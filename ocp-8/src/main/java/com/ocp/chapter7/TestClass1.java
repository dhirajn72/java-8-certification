/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Dhiraj
 * @date 13/07/18
 */
public class TestClass1 {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService service= Executors.newSingleThreadExecutor();
        Future future = service.submit(()-> {
            int i=0;
            while (i!=500) {
                System.out.println(Math.random());
                i++;
            }
        });
        Thread.sleep(20);
        future.cancel(false);
        System.out.println(future.isDone());
        service.shutdown();
    }
}
