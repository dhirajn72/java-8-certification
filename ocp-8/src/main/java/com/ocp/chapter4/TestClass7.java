/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 26/07/18
 */
public class TestClass7 {
    public static void main(String[] args) {

        Stream<Double> doubleStream1=Stream.of(Math.random());
        Stream<Double> doubleStream2=Stream.generate(Math::random);
        //Stream<Double> doubleStream3=Stream.generate(()->Math.random());


        doubleStream1.forEach(System.out::println);
        //doubleStream2.forEach(System.out::println);// TODO! Be ready to press CTRL+Z
       //doubleStream3.forEach(System.out::println);

        Stream<String> stream=Stream.of("monkey","app","bonobo");
        //Optional<String> op1=stream.min((o1, o2)->o2.length()- o1.length());
        System.out.println("monkey".hashCode()>"bonobo".hashCode());
        Optional<String> op1=stream.min(Comparator.comparingInt(String::length));
        op1.ifPresent(System.out::println);
        System.out.println("****");
        //op2.ifPresent(System.out::println);
        //stream.findAny().ifPresent(System.out::println);

        //Stream<String> stream1=Stream.generate(()->"bonobo");
        //stream1.findAny().ifPresent(System.out::println);
    }
}
