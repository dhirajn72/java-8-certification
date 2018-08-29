/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass13 {
    public static void main(String[] args) {
        Stream<Integer> stream= Stream.generate(()->(int)Math.random());
        //stream.forEach(System.out::println);
        Stream<Integer>  stream1=Stream.iterate(1,n->n+2);
        stream1.filter(x-> x<100).limit(5).forEach(System.out::println);

        List<String> list= Arrays.asList("monkey","2","chimp");
        Stream<String> stream2=Stream.generate(()->"chimp");
        Predicate<String> predicate=x->Character.isLetter(x.charAt(0));
        System.out.println(list.stream().noneMatch(predicate));
        System.out.println(stream2.noneMatch(predicate));
        //System.out.println(stream2.anyMatch(predicate));
        //System.out.println(stream2.allMatch(predicate));




    }
}
