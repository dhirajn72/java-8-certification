/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.time.*;

/**
 * @author Dhiraj
 * @date 03/09/18
 */
public class TestClass22 {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);
        System.out.println(Duration.ofDays(1));

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }
}
