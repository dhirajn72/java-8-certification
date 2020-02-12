/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Dhiraj
 * @date 14/05/19
 */
public class MapSortByValue {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> finalMap=new HashMap<>();
        map.putIfAbsent(8,"zebra");
        map.putIfAbsent(2,"apple");
        map.putIfAbsent(4,"kuta");
        map.putIfAbsent(7,"cow");
        map.putIfAbsent(12,"hen");
        map.putIfAbsent(9,"xmas");


        /*Set<String> valueKeylist = new TreeSet<>();
        for(Map.Entry<Integer, String> element: map.entrySet()){
            valueKeylist.add(element.getValue()+"&&"+element.getKey());
        }
        System.out.println(valueKeylist);
        System.out.println("*******");
        for(String values : valueKeylist){
            String[] valueKey = new String[valueKeylist.size()];
            valueKey = values.split("&&");
            finalMap.put(Integer.valueOf(valueKey[1]),valueKey[0]);
        }*/

        map=map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(key1,key2)->key1,LinkedHashMap::new));

       /* Set<Map.Entry<Integer,String>> entries= map.entrySet();
        List<Map.Entry<Integer,String>> entries1= new ArrayList<>(entries);
        Collections.sort(entries1,Comparator.comparing(Map.Entry::getValue));
        Map<Integer,String> map1=new LinkedHashMap<>();
        entries1
                .stream()
                .forEach(ob->map1.put(ob.getKey(),ob.getValue()));
        System.out.println("final map"+ map );*/
        System.out.println("final map"+ map );


    }
}
