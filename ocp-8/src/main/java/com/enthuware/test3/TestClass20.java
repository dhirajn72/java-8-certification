/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.function.DoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 22/08/18
 */
public class TestClass20 {
    public static void main(String[] args) {
        Stream<Integer> integerStream= Stream.of(1,2,3,4,5,6);
        //integerStream.mapToInt(x->x).limit(2).average().ifPresent(System.out::println);
        //integerStream.mapToDouble(x->x).limit(2).average().ifPresent(System.out::println);
        //integerStream.mapToLong(x->x).limit(2).average().ifPresent(System.out::println);
        Stream<Double> doubleStream=Stream.generate(Math::random);
        double sum= doubleStream.limit(3).mapToDouble(x->x).peek(System.out::println).sum();
        System.out.println(sum);
    }
}
