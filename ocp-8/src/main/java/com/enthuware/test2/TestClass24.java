/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.util.stream.IntStream;

/**
 * @author Dhiraj
 * @date 26/08/18
 */
public class TestClass24 {
    public static void main(String[] args) {

        for (int i=0;i<5000;i++) {

            Object v1 = IntStream.rangeClosed(10, 15)
                    .boxed()
                    .filter(x -> x > 12)
                    .parallel()
                    //      .peek(System.out::println)
                    .findAny();
            //System.out.println("****");

            Object v2 = IntStream.rangeClosed(10, 15)
                    .boxed()
                    .filter(x -> x > 12)
                    .sequential()
                    //        .peek(System.out::println)
                    .findAny();

            System.out.println(v1 + ":" + v2);
        }
    }
}
