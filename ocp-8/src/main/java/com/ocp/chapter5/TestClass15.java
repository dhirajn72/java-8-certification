/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.*;
import java.time.chrono.ChronoPeriod;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 15/09/18
 */
public class TestClass15 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(Instant.now());
        System.out.println("***");
        LocalDate date = LocalDate.of(2018, Month.MARCH, 31);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusDays(1);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(15);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusMonths(1);
        System.out.println(localDateTime);
        System.out.println("****");
        LocalDate date1 = LocalDate.now(); //2018-09-15
        Period period = Period.between(date, date1);
        System.out.println(period);

        LocalTime time1 = LocalTime.of(7, 15);
        Duration duration = Duration.between(time1, time);
        System.out.println(duration);

        System.out.println("****");
        LocalDateTime localDateTime1 = LocalDateTime.of(date, time);   // 2018-03-31T06:15
        LocalDateTime localDateTime2 = LocalDateTime.of(date1, time1); // 2018-09-15T07:15
        Duration duration1 = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration1);
        Period period1 = Period.between(date, date1);
        System.out.println(period1);
        System.out.println("168days:::" + TimeUnit.DAYS.toHours(168));
        System.out.println(LocalDate.now().plus(Period.ofYears(1)));
        System.out.println(LocalDate.now().plus(ChronoPeriod.between(date, date1)));
        System.out.println(ChronoPeriod.between(date, date1));
    }
}
