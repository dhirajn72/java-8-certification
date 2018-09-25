/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class TestClass33 {
    public static void main(String[] args) {
        Instant before=Instant.now();
        performTask();
        Instant after=Instant.now();
        System.out.println(Duration.between(before,after));
    }

    private static void performTask() {
        Arrays.asList("apple","ball","cat","dog","elephant")
                //.parallelStream()
                .stream()
                .map(x->x.toUpperCase())
                //.forEachOrdered(System.out::println);
                .forEach(System.out::println);
    }
}
