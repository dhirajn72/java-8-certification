/*
 * All Rights Reserved @Dhiraj
 */

package com.java.literals;

import java.time.Month;

/**
 * @author Dhiraj
 * @date 05/06/18
 */
public class DateTest {
    public static void main(String[] args) {
        java.time.LocalDate d1 = java.time.LocalDate.of(2015, Month.JANUARY, 31);
        java.time.LocalDateTime d2 = java.time.LocalDateTime.of(2015, Month.JANUARY, 31, 10, 56);

        java.time.LocalDateTime d3 = java.time.LocalDateTime.parse("2015-01-02T17:13:50");
        //Note that this will throw a  java.time.format.DateTimeParseException if the input string lacks the time component i.e.T17:13:50
        java.time.LocalDate d4 = java.time.LocalDate.parse("2015-01-02");
        //Note that this will throw a  java.time.format.DateTimeParseException if the input string contains the time component
        java.time.LocalTime d5 = java.time.LocalTime.parse("02:13:59.95");
        //Note that this will throw a  java.time.format.DateTimeParseException if the input string contains the Date component
        System.out.println(d5);

        Object ob=233.0;
        System.out.println(ob instanceof Double);

    }
}
