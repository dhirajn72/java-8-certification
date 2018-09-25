/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.*;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass17 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime localTime = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zone);
        System.out.println(zonedDateTime);
        zonedDateTime = zonedDateTime.plusHours(1);
        System.out.println(zonedDateTime);
    }
}
