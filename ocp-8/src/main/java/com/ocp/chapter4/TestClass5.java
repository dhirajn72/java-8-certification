/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 08/07/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        Consumer consumer=System.out::println;
       //Supplier<TestClass5> testClass5Supplier=TestClass5::new;

        Stream<String> stringStream=Stream.empty();
        consumer.accept(stringStream);
        Stream<Integer> integerStream=Stream.of(1,2,3);
        consumer.accept(integerStream);

        List<String> strings= Arrays.asList("a","b","c");
        Stream<String> stream=strings.stream();
        stream.forEach(x->{
            consumer.accept(x.contains("a"));
        });
        Stream<String> parallelStream=strings.parallelStream();
        Stream<Double> doubleStream=Stream.generate(Math::random);
        //doubleStream.forEach(x->consumer.accept(x));
        System.out.println("*******");

        Stream<String> stringStream1=strings.stream();
        Optional<String> s= stringStream1.min((o1, o2)->o1.length()-o2.length());
        s.ifPresent(x->consumer.accept(x));
        System.out.println("**********");
        //IntStream integerIntStream=new Random().ints();
        IntStream integerIntStream=IntStream.range(0,1);
        //integerIntStream.limit(2).forEach(x->consumer.accept(x));
        integerIntStream.forEach(x->consumer.accept(x));

        DoubleStream doubleStream1=new Random().doubles();
        //integerIntStream.limit(2).forEach(x->consumer.accept(x));
        doubleStream1.limit(3).forEach(x->consumer.accept(x));


    }
}

