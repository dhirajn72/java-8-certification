/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 10/07/18
 */
public class TestClass10 {
    public static void main(String[] args) {
        Consumer consumer=System.out::println;
        LocalDate localDate=LocalDate.now();
        LocalTime localTime= LocalTime.now();
        LocalDateTime localDateTime= LocalDateTime.now();
        consumer.accept(localDate);
        consumer.accept(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        consumer.accept(localTime);
        consumer.accept(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        consumer.accept(localDateTime);
        consumer.accept(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        consumer.accept(localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        //consumer.accept(localTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        consumer.accept(localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));




    }
}
