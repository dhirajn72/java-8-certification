/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2017, Month.SEPTEMBER, 12);
        LocalDate date2=LocalDate.of(2017, Month.OCTOBER, 12);

        LocalTime time=LocalTime.of(2,30);
        LocalDateTime localDateTime=LocalDateTime.of(date,time);
        System.out.println(localDateTime);

        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(time.getHour());

        System.out.println(ChronoUnit.DAYS.between(date,date2));
        System.out.println(ChronoUnit.MONTHS.between(date,date2));



        Duration duration=Duration.ofHours(6);
        System.out.println(time.plus(duration));
        System.out.println(localDateTime);


        Period period=Period.ofDays(1);
        Duration duration1=Duration.ofDays(188888);
        System.out.println(date);
        System.out.println(date.plus(period));
        //System.out.println(date.plus(duration1)); //UnsupportedTemporalTypeException: Unsupported unit: Seconds
        System.out.println(time.plus(duration1));
        System.out.println(time);

        System.out.println(date);








    }
}
