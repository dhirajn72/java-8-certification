/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass21 {
    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime localDateTime= LocalDateTime.of(localDate,localTime);

        System.out.println(localDate);
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_TIME));
        System.out.println("***");
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        //System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
    }
}
