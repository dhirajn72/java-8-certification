/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Dhiraj
 * @date 15/08/18
 */
public class TestClass14 {
    public static void main(String[] args) {
        Instant instant=Instant.now();
        LocalDateTime localDateTime= LocalDateTime.now();
        ZonedDateTime zonedDateTime= ZonedDateTime.now();
        System.out.println("****");
        System.out.println(instant);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        System.out.println("****");
        Instant nextDay=instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay);
        Instant nextHour=instant.plus(1,ChronoUnit.HOURS);
        System.out.println(nextHour);
        Instant nextWeeks=instant.plus(1,ChronoUnit.SECONDS);
        System.out.println(nextWeeks);
    }
}
