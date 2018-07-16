/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.*;

/**
 * @author Dhiraj
 * @date 13/07/18
 */
public class TestClass8 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService  scheduledExecutorService= Executors.newSingleThreadScheduledExecutor();
        Runnable task1=()-> System.out.println("runnable task");
        Callable<String> task2=()-> "callable task";
        Future<?> result1=scheduledExecutorService.schedule(task1,10, TimeUnit.SECONDS);
        Future<?> result2=scheduledExecutorService.schedule(task2,8, TimeUnit.SECONDS);
        if (scheduledExecutorService!=null)
            scheduledExecutorService.shutdown();
        System.out.println(result1.get());//will return null always
        System.out.println(result2.get());
    }
}
