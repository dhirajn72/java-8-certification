/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 28/07/18
 */
public class TestClass15 {
    public static void main(String[] args) {
        Stream<Integer>  stream= Stream.iterate(1,x->x+1);
        IntStream stream1= IntStream.of(0,1,2,3,4);

        int res=stream.limit(5).collect(Collectors.averagingInt(x->x)).intValue();
        System.out.println(res);
        stream1.limit(5).average().ifPresent(x-> System.out.println(x));
        Stream<String> stream2 = Stream.of("monkey","eat","run", "gorilla", "bonobo", "man", "bonobo", "bonobo");
        //Stream<String> stream2 = Stream.of("monkey","eat","run", "gorilla", "bonobo", "man");

        /*Map<String,Integer>stringIntegerMap2=stream2.distinct().collect(Collectors.toMap(s->s,String::length));
        System.out.println(stringIntegerMap2);*/
        /*Map<Integer,String> stringIntegerMap2=stream2.collect(Collectors.toMap(String::length,s->s,(a,b)->a+","+b));
        System.out.println(stringIntegerMap2);*/

        /*Map<Integer,List<String>> stringIntegerMap2=stream2.collect(Collectors.groupingBy(String::length));
        System.out.println(stringIntegerMap2);*/
       /* Map<Integer,Set<String>> stringIntegerMap2=stream2.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        System.out.println(stringIntegerMap2);*/

        /*Map<Integer,Set<String>> stringIntegerMap2=stream2.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        System.out.println(stringIntegerMap2);*/
        /*TreeMap<Integer,Set<String>> stringIntegerMap2=stream2.collect(Collectors.groupingBy(String::length, TreeMap::new,Collectors.toSet()));
        System.out.println(stringIntegerMap2);*/
       /* Map<Boolean,List<String>> stringIntegerMap2=stream2.collect(Collectors.partitioningBy(s->s.length()<=5));
        System.out.println(stringIntegerMap2);*/
        Map<Integer,Long> stringIntegerMap2=stream2.collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));
        System.out.println(stringIntegerMap2);





    }
}
