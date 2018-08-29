/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.*;

/**
 * @author Dhiraj
 * @date 25/08/18
 */
public class TestClass6 {
    public static void main(String[] args) {
        Deque<Integer> integers= new ArrayDeque<>();
        integers.add(23);
        integers.add(12);
        integers.add(32);
        integers.push(2);
        integers.offer(3);
        integers.offerFirst(4);
        //integers.stream().forEach(x-> System.out.print(x+", "));
        System.out.println("******");
        HashSet<Integer> integers1= new HashSet<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        integers1.add(6);
        //integers1.stream().forEach(System.out::println);
        Iterator<Integer> iterator=integers1.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+", ");


    }
}
