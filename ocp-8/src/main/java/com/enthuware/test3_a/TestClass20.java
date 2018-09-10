/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.time.*;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass20 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2016, Month.MARCH,13);
        LocalTime localTime=LocalTime.of(1,30);
        ZoneId zoneId=ZoneId.of("US/Eastern");

        ZonedDateTime zonedDateTime=ZonedDateTime.of(localDate,localTime,zoneId);
        System.out.println(zonedDateTime);
        zonedDateTime= zonedDateTime.plusHours(1);
        System.out.println(zonedDateTime);
    }
}
