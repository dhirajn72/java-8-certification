/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass3 {
    public static void main(String[] args) {
        System.out.println("Traditional way");
        int i = 0;
        while (i < 10) {
           // System.out.println(i);
            i++;
        }
        System.out.println("Java 8 way");
        //Stream.iterate(0, x -> ++x).limit(10).forEach(System.out::println);

        Stream.iterate(2,x->x*x)
                .limit(5)
                .forEach(System.out::println);

    }
}
