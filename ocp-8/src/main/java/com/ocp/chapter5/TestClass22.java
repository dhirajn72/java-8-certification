/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass22 {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2018,6,23));
        System.out.println(LocalDate.of(2018, Month.JUNE,23));
        LocalDateTime localDateTime=LocalDateTime.of(2015,5,10,11,22,33);
        Period p= Period.of(1,2,3);
        localDateTime=localDateTime.minus(p);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(localDateTime.format(dateTimeFormatter));

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x);
        System.out.println(ld1+" "+zd1);
        System.out.println(ld2+" "+zd2);

    }
}
