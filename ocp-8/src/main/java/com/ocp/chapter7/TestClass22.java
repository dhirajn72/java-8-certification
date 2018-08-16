/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Dhiraj
 * @date 02/08/18
 */
public class TestClass22 {
    public static void main(String[] args) {

        System.out.println("main starts");

        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "test");
        Set<Integer> integers = map.keySet();
        //never ending loop
        while (!integers.isEmpty()) {
            integers.stream().forEach(x -> {
                System.out.println(x);
                map.remove(x);
                map.put(x, "A");
            });
        }
        System.out.println("main ends");

    }
}
