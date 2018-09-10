/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.time.*;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass19 {
    public static void main(String[] args) {
        Duration duration=Duration.ofMinutes(200);
        System.out.println(duration);
        Period period=Period.ofWeeks(89);
        System.out.println(period);


        LocalDateTime localDateTime=LocalDateTime.of(2014, Month.JANUARY,22,1,30);
        LocalDateTime localDateTime1=LocalDateTime.now();

        Duration duration1= Duration.between(localDateTime,localDateTime1);
        System.out.println(duration1);

        LocalDate localDate=LocalDate.of(2014, Month.JANUARY,22);
        LocalDate localDate1=LocalDate.now();

        Period period1=Period.between(localDate,localDate1);
        System.out.println(period1);


    }
}
