/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class TestClass32 {
    public static void main(String[] args) {
        TreeSet<String> treeSet= new TreeSet<>();
        //treeSet.add(null);

        TreeMap<String,Integer> treeMap= new TreeMap<>();
        //treeMap.put(null,null);

        ConcurrentSkipListSet<String> strings= new ConcurrentSkipListSet<>();
        //strings.add(null);

        ConcurrentSkipListMap<String,Integer> skipListMap= new ConcurrentSkipListMap<>();
        //skipListMap.put(null,null);
    }
}
