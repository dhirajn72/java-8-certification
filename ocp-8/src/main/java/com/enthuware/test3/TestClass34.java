/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 12/09/18
 */
public class TestClass34 {
    public static void main(String[] args) {
        Stream<String>stream=Stream.of("apple","ball","ball","cat","dog","dog","elephant");
        /*TreeMap<String,Long> treeMap1=stream.collect(Collectors.groupingBy(x->x,TreeMap::new,Collectors.counting()));
        treeMap1.forEach((k,v)-> System.out.println(k+":"+v));
        System.out.println(treeMap1 instanceof TreeMap);*/

        List<String>list=stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
