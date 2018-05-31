/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

import java.time.LocalDate;
import java.util.*;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

/**
 * @author Dhiraj
 * @date 15/05/18
 */
public class DateTest {
    public static void main(String[] args) {

        LocalDate today= LocalDate.now();
        LocalDate lastYearTodaysDate=LocalDate.now().minusDays(364);
        //LocalDate lastYearTodaysDate=LocalDate.now().minusMonths(12);

        //System.out.println(today+" "+lastYearTodaysDate);

        List<LocalDate> totalDates = new ArrayList<>();
        while (!lastYearTodaysDate.isAfter(today)) {
            totalDates.add(lastYearTodaysDate);
            lastYearTodaysDate = lastYearTodaysDate.plusDays(1);
        }

        for (LocalDate date:totalDates){
            // System.out.println(date);
        }

        Map<LocalDate,LocalDate> startEnd=new LinkedHashMap<>();
        for (LocalDate date:totalDates){
            LocalDate start = date.with(firstDayOfMonth());
            LocalDate end = date.with(lastDayOfMonth());
            startEnd.put(start,end);
        }
        Set<Map.Entry<LocalDate,LocalDate>> dates= startEnd.entrySet();
        for(Map.Entry<LocalDate,LocalDate> date:dates){
            System.out.println(date.getKey()+":"+date.getValue());
        }
    }
}

