/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 21/08/18
 */
public class TestClass15 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList();
        List<String> list1= Arrays.asList("1","2","3");
        List<String> list2= Arrays.asList("a","b","c","d");
        Stream<List<String>> stream=Stream.of(list,list1,list2);
        //stream.flatMap(l->l.stream().limit(2)).limit(3).forEach(System.out::println);
        stream.flatMap(l->l.stream()).forEach(System.out::println);
        Stream<String> stream1= Stream.of("a","b","c");

        //Both are same code
        //List<String> list3=stream1.collect(Collectors.toCollection(ArrayList::new));
        List<String> list3=stream1.collect(ArrayList::new,(x,y)->x.add(y),(x,y)->x.addAll(y));
        System.out.println(list3);
    }
}
