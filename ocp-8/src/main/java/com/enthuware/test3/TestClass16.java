/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 21/08/18
 */
public class TestClass16 {
    public static void main(String[] args) {
        Stream<String> stream= Stream.of("cat","elephant","ball","apple","dog");
        //stream.sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
        stream.sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}