/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 29/08/18
 */
public class TestClass27 {
    public static void main(String[] args) {
        List<Integer> integers= new CopyOnWriteArrayList<>();
        //List<Integer> integers= new ArrayList<>();

        Stream<Integer> integerStream=Stream.of(1,2,3,4,5,6,7,8,9);
        integerStream.parallel().map(x->{
            //System.out.println(x);
            integers.add(x);
            return x;
        }).forEachOrdered(x-> System.out.print(x+" "));

        try {
            Thread.sleep(50);
            System.out.println();
            for (Integer i:integers)
                System.out.print(i+" ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("****");

        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8).stream().findAny());
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8).parallelStream().findAny());
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8).stream().findFirst());
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8).parallelStream().findFirst());
    }
}
