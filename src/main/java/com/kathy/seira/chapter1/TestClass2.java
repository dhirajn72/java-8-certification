/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import  java.time.Period;



/**
 * @author Dhiraj
 * @date 17/06/18
 */
public class TestClass2 {
    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);
        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
        System.out.println(0.0014258942663600022 < 0.0016498571975501702);
    }
}
