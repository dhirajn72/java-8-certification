/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        Consumer consumer=System.out::println;
        Stream<Integer> integerStream1= Arrays.asList(12,32,11,45).parallelStream();
        Stream<Integer> integerStream2= Arrays.asList(12,32,11,45).stream();
        //integerStream1.forEach(consumer::accept);
        integerStream1.forEachOrdered(consumer::accept);
        consumer.accept("******");
        integerStream2.forEach(consumer::accept);
        consumer.accept("*****@@@@@@******");
        consumer.accept(Arrays.asList(23,76,3,79,24).stream().findAny().get());
        consumer.accept(Arrays.asList(23,76,3,79,24).parallelStream().findAny().get());


    }
}
