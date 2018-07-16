/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class TestClass13 {
    public static void main(String[] args) {

        Consumer consumer = System.out::println;
        //Map<String, String> map = new HashMap<>();
        Map<String, String> map = new ConcurrentHashMap<>();

        map.put("a", "test1");
        map.put("b", "test2");
        map.put("c", "test3");
        for (String key : map.keySet())
            consumer.accept(map.remove(key));

        consumer.accept("Map Object::" + map);
    }
}
