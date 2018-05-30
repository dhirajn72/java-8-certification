/*
 * All Rights Reserved @Dhiraj
 */

package com.java.oracle;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Dhiraj
 * @date 27/05/18
 */
public class Test {
    public static void main(String[] args) {
        System.out.printf("Apr 15, 1994 @ 11:30am: %s%n",
                LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
    }
}
