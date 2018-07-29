/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 28/07/18
 */
public class TestClass13 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("5.6", "7.4", "4","1", "2.3");
        //Stream<String> stream1 = Stream.of("monkey", "gorilla", "bonobo", "man", "bonobo", "bonobo");
        List<String> list1 = Arrays.asList("monkey", "gorilla", "bonobo", "man", "bonobo", "bonobo");
        // Using Stream flatMap(Function mapper)
        // list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);

        Stream<List<String>> listStream=Stream.of(list1,list);
        listStream.flatMap(l->l.stream()).forEach(System.out::println);
        System.out.println("****");

        //list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        list.stream().sorted().forEach(System.out::println);

        Stream<String> stream= Stream.of("black bear","brown bear","grizzley");
        long count=stream.filter(x->x.startsWith("g")).peek(x-> System.out.println("yes::"+x)).count();
        System.out.println(count);

        System.out.println("########");
        List<String> list2 = Arrays.asList("monkey","eat","run", "gorilla", "bonobo", "man", "bonobo", "bonobo");
        list2.stream().filter(x->x.length()==3).sorted().limit(2).forEach(System.out::println);
    }
}
