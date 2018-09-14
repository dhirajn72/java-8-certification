/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.*;
import java.util.function.BiFunction;

/**
 * @author Dhiraj
 * @date 13/09/18
 */
public class TestClass8 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.push("a");
        list.push("b");
        list.push("c");
        list.push("d");

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("one");
        treeSet.add("One");
        treeSet.add("ONE");
        System.out.println(treeSet.ceiling("On"));

        BiFunction<String,String,String> biFunction=(v1,v2)->null;
        Map<String,String> stringMap= new HashMap<>();
        stringMap.put("Jenny","Bus Tour");
        stringMap.put("Tom","Bus Tour");
        stringMap.merge("Jenny","Skyride",biFunction);
        stringMap.merge("Sam","Skyride",biFunction);
        System.out.println(stringMap);
        //stringMap.merge("Sam","Skyride",biFunction);
        //System.out.println(stringMap);

        stringMap.computeIfPresent("Sam",(x,y)->null);
        System.out.println(stringMap);












    }
}
