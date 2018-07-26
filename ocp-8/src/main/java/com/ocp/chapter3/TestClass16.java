/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 25/07/18
 */
public class TestClass16 {
    public static void main(String[] args) {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(78);
        integers.add(79);
        integers.add(88);

        /*System.out.println(integers.element()+""+integers.element());
        System.out.println(integers);*/
        integers.offer(67);
        integers.push(77);
        System.out.println(integers);

        System.out.println("*****");

        Supplier<Person_A> personSupplier = () -> new Person_A(99, "test");

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("a", "vv");
        stringMap.putIfAbsent("b", "test");
        stringMap.putIfAbsent("a", "test");
        System.out.println(stringMap);
        System.out.println(stringMap.remove("r"));

        BiFunction<String, String, String> mapper = (v1, v2) -> {
            String res = v1.length() > v2.length() ? v1 : v2;
            return res;
        };

        Map<String, String> map = new HashMap<>();
        //map.put("jenny", "Bus Tour");
        map.put("jenny", null); // Lambda implementation won't be called at all, in case of null
        map.put("Tom", "Tram");
        String s1 = map.merge("Tom", "Sky  ride", mapper);
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println("*******");
        Map<String,Integer> map1= new HashMap<>();
        map1.put("Jenny",1);

        BiFunction<String,Integer,Integer> mapper1= (k,v)->{
            int res=v+1;
            return res;
        };
        map1.computeIfPresent("Jenny",mapper1);
        map1.computeIfPresent("Sam",mapper1);

        map1.forEach((k,v)-> System.out.println(k+":"+v));

        /*BiFunction<String,Integer,Integer> mapper2= (k,v)->{
            int res=v+1;
            return res;
        };*/

        System.out.println("@@");
        Function<String,Integer> mapper2= (k)->{
            int res=100;
            return null;
        };

        map1.computeIfAbsent("Jenny",mapper2);
        map1.computeIfAbsent("Sam",mapper2);
        map1.forEach((k,v)-> System.out.println(k+":"+v));
    }
}

class Person_A {
    int id;
    String name;


    public Person_A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
