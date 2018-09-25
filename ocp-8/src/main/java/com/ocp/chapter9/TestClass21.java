/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 24/09/18
 */
public class TestClass21 {
    public static void main(String[] args) {
        //Stream<Integer> integerStream= Stream.generate(()->new Integer(1));
        Stream<Integer> integerStream= Stream.iterate(1,x->x+1);
        //integerStream.limit(10).forEach(System.out::println);
    }
}
