/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 27/07/18
 */
public class TestClass19 {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        //stringMap.put("a", "vv");
        stringMap.put("a", null);
        stringMap.putIfAbsent("b", "test");
        stringMap.putIfAbsent("a", "test");
        System.out.println(stringMap);
        //System.out.println(stringMap.remove("r"));
    }
}
