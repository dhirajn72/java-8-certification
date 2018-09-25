/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass31 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        //for (int ii=0;ii<20;ii++) {
            service.scheduleWithFixedDelay(() -> {
                        for (int i = 0; i < 3; i++) System.out.println(Thread.currentThread().getName() + " >> " + i);
                        System.out.println("*****");
                    },
                    5, 2, TimeUnit.SECONDS);
        //}

        //service.shutdown();


    }
}
