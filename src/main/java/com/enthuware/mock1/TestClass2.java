/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 * @author Dhiraj
 * @date 27/05/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        ArrayList<Double> doubles= new ArrayList<>();
        doubles.add(11.0);
        System.out.println(doubles.indexOf(11.0));
       // System.out.println(doubles.get());
        boolean b=false;
        Instant timestamp = Instant.now();
        System.out.println(timestamp.toString());
        //Instant oneHourLater = Instant.now().plu
        System.out.println();
        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(1990, Month.SEPTEMBER, 22);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() +
                " days old. (" + p2 + " days total)");

        long p3=ChronoUnit.MONTHS.between(birthday, today);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() +
                " days old. (" + p3 + " Months total)");

        LocalDate nextBDay = birthday.withYear(today.getYear());
        System.out.println(nextBDay);


    }
}


class A {
}

class B {
    B() {
    }
}

class C {
    C(String s) {
    }
}