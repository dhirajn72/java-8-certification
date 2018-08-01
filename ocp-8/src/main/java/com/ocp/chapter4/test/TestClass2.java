/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4.test;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        Predicate<? super String> predicate=s->s.startsWith("g");
        Stream<String> stream1= Stream.generate(()->"growl!");
        Stream<String> stream2= Stream.generate(()->"growl!");

        boolean b1=stream1.anyMatch(predicate);
        boolean b2=stream2.allMatch(predicate);
        System.out.println(b1+" "+b2);
    }
}
