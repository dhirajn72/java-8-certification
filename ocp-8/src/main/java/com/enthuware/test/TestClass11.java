/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Dhiraj
 * @date 11/08/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list->list.subList(2, 4);
        List<String> vow=f.apply(vowels);
        vowels.forEach(System.out::print);
        System.out.println();
        //vow.forEach(System.out::println);
    }
}
