/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass21 {
    public static void main(String[] args) {
        Instant start = Instant.parse("2015-06-25T16:13:30.00z");
        start.plus(10, ChronoUnit.HOURS);
        System.out.println(start);

        Duration timeToCook = Duration.ofHours(1);
        Instant readyTime = start.plus(timeToCook);
        System.out.println(readyTime);

        LocalDateTime ltd = LocalDateTime.ofInstant(readyTime, ZoneId.of("GMT-2"));
        System.out.println(ltd);
    }
}
