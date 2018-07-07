/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 08/07/18
 */
public class chapter5 {
    public static void main(String[] args) {
        Consumer consumer=System.out::println;

        Stream<String> stringStream=Stream.empty();
        consumer.accept(stringStream);
        Stream<Integer> integerStream=Stream.of(1,2,3);
        consumer.accept(integerStream);
    }
}
