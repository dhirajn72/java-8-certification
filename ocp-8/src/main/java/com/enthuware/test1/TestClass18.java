/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 29/08/18
 */
public class TestClass18 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+":::starts!!");
        ScheduledExecutorService service = Executors.newScheduledThreadPool(20);
        //service.scheduleAtFixedRate(() -> System.out.println("exeuting submitted task"), 1, 1, TimeUnit.SECONDS);
        System.out.println(Thread.currentThread().getName()+":::ends!!");
        TestClass18 t=new TestClass18();

        //service.scheduleWithFixedDelay(()-> { taskExecutor();},1,1,TimeUnit.SECONDS);
        service.scheduleAtFixedRate(()-> {
            System.out.println(Thread.currentThread().getName()); t.taskExecutor();},1,1,TimeUnit.SECONDS);


        //if (service!=null)service.shutdown();

        try {
            service.awaitTermination(3,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            Thread.getAllStackTraces().keySet().stream().filter(x -> x.getState() == Thread.State.RUNNABLE).forEach(x -> x.getName());
        }
    }

    private  void taskExecutor() {
        System.out.println(Thread.currentThread().getName());
        while (true);
    }
}