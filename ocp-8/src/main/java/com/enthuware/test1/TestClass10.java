/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 14/08/18
 */
public class TestClass10 {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        Stream<Integer> stream = Stream.of(11, 11, 22, 33).parallel();
        stream.filter( e->{
            ai.incrementAndGet();
            return e%2==0;
        });
        System.out.println(ai);
    }
}
