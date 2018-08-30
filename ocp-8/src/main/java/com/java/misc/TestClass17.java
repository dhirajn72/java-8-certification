/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Dhiraj
 * @date 29/08/18
 */
public class TestClass17 {
    public static void main(String[] args) {
        Set<Integer> integers= new ConcurrentSkipListSet<>();
        //integers.add(null);
        System.out.println(integers);
        Map<Integer,String> map=new ConcurrentSkipListMap<>();
        map.put(1,"a");
        map.computeIfPresent(1,(x,y)->{
            System.out.println(x+":"+y);
            return "test";
        });
        System.out.println(map);
        //map.put(null,"test2");
        //map.put(2,null);

        List<Integer> integers1=new CopyOnWriteArrayList<>();
        List<Integer> integers2= integers1;
        integers1.add(1);
        integers1.add(null);
        System.out.println(integers1==integers2);
        integers2.add(2);
        System.out.println(integers1);
        Set<Integer> integers3= new CopyOnWriteArraySet<>();
        integers3.add(null);
        System.out.println(integers3);
    }
}
