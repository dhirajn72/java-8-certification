/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.time.Duration;
import java.time.Period;

/**
 * @author Dhiraj
 * @date 15/08/18
 */
public class TestClass16 {
    public static void main(String[] args) {
        Duration d = Duration.ofDays(1);
        System.out.println(d);
        d = Duration.ofMinutes(0);
        System.out.println(d);
        Period p = Period.ofMonths(0);
        System.out.println(p);
    }
}
