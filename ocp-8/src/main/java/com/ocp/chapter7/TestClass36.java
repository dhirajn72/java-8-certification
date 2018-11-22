/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class TestClass36 {


    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(23,"cat");
        map.put(12,"apple");
        map.put(43,"elephant");
        map.put(21,"ball");
        map.put(56,"dog");
        map.forEach((x,y)-> System.out.println(x+":"+y));



        LinkedHashMap<Integer, String> result = map
                                                .entrySet()
                                                .stream()
                                                .sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
                                                .collect(Collectors.toMap(x->x.getKey(), x->x.getValue(), (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(result);

        Map<Integer,String> map1= new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue()).forEachOrdered(x->map1.put(x.getKey(),x.getValue()));
        System.out.println(map1);

        LinkedHashMap<Integer,String> map2=map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue())
                .collect(Collectors.toMap(x->x.getKey(),x->x.getValue(),(oldValue,newValue)->oldValue,LinkedHashMap::new));
        System.out.println(map2);

        LinkedHashMap<Integer,String> linkedHashMap= new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().reversed()).forEachOrdered(x->linkedHashMap.put(x.getKey(),x.getValue()));
        System.out.println(linkedHashMap);






    }




}
