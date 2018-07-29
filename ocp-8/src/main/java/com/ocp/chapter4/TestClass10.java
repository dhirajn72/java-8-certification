/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import apple.laf.JRSUIUtils;

import java.util.Collection;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 27/07/18
 */
public class TestClass10 {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("w","o","l","f");

        //Supplier<StringBuilder> stringBuilderSupplier=()->{return new StringBuilder();};
        Supplier<StringBuilder> stringBuilderSupplier=StringBuilder::new;
        BiConsumer<StringBuilder,String> biConsumer1= (x, y)->{x.append(y);};
        BiConsumer<StringBuilder,StringBuilder> biConsumer2= (x, y)->{x.append(y);};

        //stream.collect(stringBuilderSupplier,StringBuilder::append,StringBuilder::append); //Using method reference
        StringBuilder word=stream.collect(stringBuilderSupplier,biConsumer1,biConsumer2);   // Without using method reference
        System.out.println(word);

        Stream<Integer> stream1=Stream.of(1,2,3,4,5);
        /*int res=stream1.mapToInt((x)-> x.intValue()).sum();
        System.out.println(res);*/

        Supplier<TreeSet> treeSetSupplier=TreeSet::new;
        BiConsumer<TreeSet,Integer> stringBiConsumer=(t,v)->t.add(v);
        BiConsumer<TreeSet,TreeSet> setBiConsumer=(t,v)->t.addAll(v);

        //stream1.collect(treeSetSupplier,stringBiConsumer,setBiConsumer).forEach(System.out::println);// Just prints stream1 data
        //stream1.collect(()->new TreeSet(),(x,y)->x.add(y),(x,y)->x.addAll(y)).forEach(System.out::println);
        //stream1.collect(TreeSet::new,TreeSet::add,TreeSet::addAll).forEach(System.out::println);
        //stream1.collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);
        TreeSet<Integer> treeSet=stream1.collect(Collectors.toCollection(TreeSet::new));
        treeSet.forEach(System.out::println);
        System.out.println(treeSet);
    }
}
