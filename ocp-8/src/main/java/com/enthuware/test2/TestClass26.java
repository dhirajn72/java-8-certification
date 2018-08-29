/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.util.*;

/**
 * @author Dhiraj
 * @date 27/08/18
 */
public class TestClass26 {
    public static void main(String a[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue()); //Descending
                //return (o1.getValue()).compareTo( o2.getValue() ); Ascending
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }
    }
}