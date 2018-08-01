/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.*;
import java.util.Locale;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time=LocalTime.of(1,30);
        ZoneId zoneId= ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime=ZonedDateTime.of(date,time,zoneId);
        //ZoneId.getAvailableZoneIds().stream().filter(x->x.contains("US")).forEach(System.out::println);

        Duration duration= Duration.ofHours(1);
        System.out.println(zonedDateTime.plus(duration));

        System.out.println(Locale.ENGLISH);
        System.out.println(new Locale("en"));




    }
}
