/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Dhiraj
 * @date 03/09/18
 */
public class TestClass23 {
    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.of(2015, Month.MARCH, 8, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        LocalDateTime ld2 = LocalDateTime.of(2015, Month.MARCH, 8, 3, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x);


        System.out.println("******");
        Duration d = Duration.ofDays(1);
        System.out.println(d);
        d = Duration.ofMinutes(0);
        System.out.println(d);
        Period p = Period.ofMonths(0);
        System.out.println(p);
    }
}
