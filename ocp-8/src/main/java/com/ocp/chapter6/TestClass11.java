/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class TestClass11 {
    public static void main(String[] args) {

        System.out.println(TimeUnit.MILLISECONDS.toNanos(1));
        System.out.println(TimeUnit.SECONDS.toMillis(1));
        System.out.println(TimeUnit.HOURS.toSeconds(1));
    }
}
