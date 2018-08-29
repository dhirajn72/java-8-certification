/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 21/08/18
 */
public class TestClass14 {
    public static void main(String[] args) {
        Stream<String> stream= Stream.of("w","o","l","f");

        //All are same code
        //TreeSet<String> treeSet=stream.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        //TreeSet<String> treeSet=stream.collect(()->new TreeSet<>(),(x,y)->x.add(y),(x,y)->x.addAll(y));
        TreeSet<String> treeSet=stream.collect(Collectors.toCollection(TreeSet::new));


        System.out.println(treeSet);
    }
}
