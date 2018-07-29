/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 28/07/18
 */
public class TestClass12 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);

        //Without limit it will hang,
        //stream.limit(10).collect(Collectors.toList()).forEach(System.out::println);
        //stream.skip(4).limit(10).collect(Collectors.toList()).forEach(System.out::println);

        Stream<String> stream1 = Stream.of("monkey", "gorilla", "bonobo", "man", "bonobo", "bonobo");
        //stream1.map(String::length).forEach(System.out::println);
        stream1.map((x) -> {
            int len = x.length();
            System.out.println("Length of " + x + " is " + len);
            return len;
        }).forEach(System.out::println);
    }
}
