/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import com.ocp.utils.ListUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 19/09/18
 */
public class TestClass18 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "cat");
        map.put(12, "apple");
        map.put(43, "elephant");
        map.put(21, "ball");
        map.put(56, "dog");

        System.out.println(map);
        Map<Integer,String > map1=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));
        System.out.println(map1);
        Map<Integer,String > map2=map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x, LinkedHashMap::new));
        System.out.println(map2);


        System.out.println(map);
        System.out.println("Old value::"+map.put(56, "dog-edited"));
        System.out.println(map);






    }
}
