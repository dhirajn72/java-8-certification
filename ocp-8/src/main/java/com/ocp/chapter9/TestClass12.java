/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 15/09/18
 */
public class TestClass12 {
    public static void main(String[] args) {
        //System.out.println(0%20);

        Stream<Integer> stream= Stream.of(1,2,3,4,5);
        IntStream stream1=null;//stream.flatMapToInt(x->IntStream.of(x));  // Case 1 :stream to IntStream
        //stream1.forEach(System.out::println);
        //stream=stream1.boxed();
        stream1= stream.mapToInt(x->x);  //         Case 2: stream to IntStream
        stream1.forEach(System.out::println);

    }
}
