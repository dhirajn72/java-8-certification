/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 10/07/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        Consumer consumer=System.out::println;
        consumer.accept(ZoneId.getAvailableZoneIds().stream().sorted().count());
        //ZoneId.getAvailableZoneIds().stream().sorted().forEach(x->consumer.accept(x));

        System.out.println(Period.of(1,2,3));
        System.out.println(Period.of(0,20,47));
        System.out.println(Period.ofWeeks(5));

        System.out.println(Duration.ofNanos(990000000));
        System.out.println(ChronoUnit.DECADES.between(LocalDateTime.of(1,1,1,1,1), LocalDateTime.now()));

        Instant i1=Instant.now();
        int i=1;
        while (i!=500000)
            i++;
        Instant i2=Instant.now();
        Duration duration=Duration.between(i1,i2);
        System.out.println(duration.toMillis());





    }
}
