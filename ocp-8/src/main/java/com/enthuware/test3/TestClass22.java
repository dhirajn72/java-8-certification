/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 22/08/18
 */
public class TestClass22 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("lions", "tigers", "bears");
        Map<String,Integer> map=stream.collect(Collectors.toMap(x->x,String::length));
        System.out.println(map);
        //map.keySet().stream().map(x->x+":"+map.get(x)).forEach(System.out::println);
        /*TreeMap<Integer,String> map= stream.collect(Collectors.toMap(String::length, k->k,(s1, s2)->s1+","+s2,TreeMap::new));
        System.out.println(map);*/

        /*Map<Integer, List<String>> listMap = stream.collect(Collectors.groupingBy(String::length));
        System.out.println(listMap);*/

        /*Map<Integer, Set<String>> listMap = stream.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        System.out.println(listMap);*/

        /*TreeMap<Integer, Set<String>> listMap = stream.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toSet()));
        System.out.println(listMap);*/
    }
}
