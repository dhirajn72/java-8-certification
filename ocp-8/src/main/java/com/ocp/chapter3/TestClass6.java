/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class TestClass6 {
    public static void main(String[] args) {
        List<Integer> integers= new ArrayList<>();
        integers.add(2);
        integers.add(7);
        integers.add(6);
        System.out.println(integers);
        integers.replaceAll(x->x*2);
        System.out.println(integers);
        System.out.println("************");

        BiFunction<String,String,String> mapper=(s1, s2) -> {
            System.out.println(s1+" "+s2);
            //return s2;
            return null;
        };

        Map<String,String> stringMap= new HashMap<>();
        stringMap.put("TestClass1","Apple");
        stringMap.put("B","Ball");
        stringMap.put("C","Cat");

        System.out.println(stringMap);
        stringMap.merge("TestClass1","Main",mapper);
        System.out.println(stringMap);









    }
}
