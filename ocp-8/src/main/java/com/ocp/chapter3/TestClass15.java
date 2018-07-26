/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.*;

/**
 * @author Dhiraj
 * @date 25/07/18
 */
public class TestClass15 {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        //list=new ArrayList();
        list.push("d");
        list.push("g");
        list.push("c");
        list.push("e");
        list.offer("x");
        list.offerFirst("xx");

        Stack stack= new Stack();
        /*stack.push("xs");
        stack.pop();
        stack.peek();*/

        System.out.println(list);
        System.out.println(list.peekLast());
        System.out.println(list);
        System.out.println("*******");
        NavigableSet<Integer> integers= new TreeSet<>();
        integers.add(78);
        integers.add(34);
        integers.add(98);
        integers.add(23);
        System.out.println(integers.lower(34));
        System.out.println(integers.floor(34));
        System.out.println(integers.ceiling(35));
        System.out.println(integers.lower(98));
        System.out.println("****");
        Map<String,String> map=new HashMap<>();
        map.put("kola","bamboo");
        map.put("lion","meat");
        map.put("giraffe","leaf");
        map.put("cow","grass");
        map.forEach((x,y)->{
            System.out.println(x+" "+y);
        });
        System.out.println("*****");
        for (String key:map.keySet())
            System.out.println(key+":"+map.get(key));
        System.out.println(map.containsValue("grass"));
    }
}
