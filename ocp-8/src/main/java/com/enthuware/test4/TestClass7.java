/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.time.*;

/**
 * @author Dhiraj
 * @date 25/08/18
 */
public class TestClass7 {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        System.out.println(LocalDateTime.now());
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 1, 10, 10));
        System.out.println(d);
    }
}
