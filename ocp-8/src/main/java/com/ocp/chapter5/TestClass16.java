/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.*;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass16 {
    public static void main(String[] args) {

        LocalDate localDate=LocalDate.of(2017, Month.MARCH,31);
        LocalDate localDate1=LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate1);
        Period period= Period.between(localDate,localDate1); // OLD Date should be the start, else result will be negative
        System.out.println(period); //  P1Y5M15D


        LocalDateTime localDateTime= LocalDateTime.of(2017,Month.MARCH,31,4,40);
        LocalDateTime localDateTime1= LocalDateTime.now();
        Duration duration= Duration.between(localDateTime,localDateTime1);
        System.out.println(duration);
        System.out.println(duration.toDays());

        System.out.println("**");
        System.out.println(Period.ofWeeks(-10));
        System.out.println(Period.ofMonths(-10));
        System.out.println(Period.ofYears(-10));

        System.out.println(Duration.ofSeconds(-10)); //  PT1M5S
        System.out.println(Duration.ofMinutes(-10)); //   PT1H5M
        System.out.println(Duration.ofDays(-10));    //   PT24H

        System.out.println(ChronoPeriod.between(localDate,localDate1));
        System.out.println(ChronoUnit.DAYS.between(localDate,localDate1));
        System.out.println(ChronoUnit.MONTHS.between(localDate,localDate1));
        System.out.println(ChronoUnit.DAYS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.HOURS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.MONTHS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.SECONDS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.MILLIS.between(localDateTime,localDateTime1));
        System.out.println(ChronoUnit.NANOS.between(localDateTime,localDateTime1));
    }
}
