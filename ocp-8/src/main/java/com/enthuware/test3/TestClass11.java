/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        /*for (int i=0;i<50;i++){
            int r = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.println(r);
        }*/

        AtomicInteger ai = new AtomicInteger();
        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
        stream.filter( e->{
            ai.incrementAndGet();
            return e.contains("o");
        }).allMatch(x->x.indexOf("o")>0);

        System.out.println("AI = "+ai);
    }
}
