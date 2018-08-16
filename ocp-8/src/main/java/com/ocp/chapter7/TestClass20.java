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
 * @date 02/08/18
 */
public class TestClass20 {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);

        //scheduler.scheduleAtFixedRate(() -> {System.out.println("scheduleAtFixedRate: " + new Date());int i=0;while (true){try { Thread.sleep(500);}catch (InterruptedException e){} }}, 1, 3L, TimeUnit.SECONDS);
        //scheduler.scheduleWithFixedDelay(() -> {System.out.println("scheduleWithFixedDelay: " + new Date());int i=0;while (true){try { Thread.sleep(500);}catch (InterruptedException e){} }}, 1, 3L, TimeUnit.SECONDS);


        scheduler.scheduleAtFixedRate(() -> {System.out.println("scheduleAtFixedRate: " + new Date());}, 1, 3L, TimeUnit.SECONDS);
        //scheduler.scheduleWithFixedDelay(() -> {System.out.println("scheduleWithFixedDelay: " + new Date());}, 1, 3L, TimeUnit.SECONDS);

    }
}
