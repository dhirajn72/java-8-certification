/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(()-> System.out.println("open zoo"),0,1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        AtomicInteger value1=new AtomicInteger(0);
        final  long[] value2={0};

        IntStream.iterate(1,i->1).limit(100).parallel().forEach(i->value1.incrementAndGet());
        IntStream.iterate(1,i->1).limit(100).parallel().forEach(i->++value2[0]);
        System.out.println(value1+" : "+value2[0]);
    }
}
