/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 15/09/18
 */
public class TestClass13 {
    public static void main(String[] args) {
        IntStream intStream= Stream.of(1,2,3,4,5).flatMapToInt(x->IntStream.of(x));
        //intStream.average().ifPresent(System.out::println);
        //DoubleStream doubleStream=intStream.mapToDouble(x->x);
        //doubleStream.average().ifPresent(System.out::println);

        //double average=doubleStream.mapToObj(x->x).collect(Collectors.averagingDouble(x->Double.valueOf(x)));
        //doubleStream.average().ifPresent(System.out::println);

        //double average= intStream.mapToLong(x->x).boxed().collect(Collectors.averagingLong(x->Long.valueOf(x))); // intStream->longStream->Stream then collecting results
        //double average=intStream.boxed().collect(Collectors.averagingLong(x->Long.valueOf(x))); // intStream->Stream then collecting results
        double average=intStream.mapToObj(x->x).collect(Collectors.averagingLong(x->Long.valueOf(x))); // intStream->Stream then collecting results
        System.out.println(average);
    }
}
