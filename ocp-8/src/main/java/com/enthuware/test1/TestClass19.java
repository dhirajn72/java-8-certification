/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 07/09/18
 */
public class TestClass19 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strings={"apple","ball","ball","cat","dog","dog","elephant"};

        Stream<Integer> stream = IntStream.of(arr).mapToObj(x -> x);
        //stream.forEach(System.out::println);
        //System.out.println(stream.mapToInt(x->x).sum());
        //stream.mapToInt(x->x).average().ifPresent(System.out::println);
        //System.out.println(Optional.empty());

        /*String res=stream.map(String::valueOf).reduce("",(a,b)->a+b);
        System.out.println(res);*/

        //System.out.println(stream.mapToInt(x -> x).sum());

        /*Map<Integer, Integer> map=stream.collect(Collectors.toMap(x->x+1, x->x+x));
        map.forEach((x,y)-> System.out.println(x+":"+y));*/

        Stream<String> stringStream=Stream.of(strings);
        //Map<Integer,List<String>> listMap=stringStream.collect(Collectors.groupingBy(x->x.length()));

        /**
         * Uses distinct to remove duplicates
         */
        Map<String,Long> listMap= stringStream.distinct().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        listMap.forEach((x,y)->System.out.println(x+":"+y));
    }
}
