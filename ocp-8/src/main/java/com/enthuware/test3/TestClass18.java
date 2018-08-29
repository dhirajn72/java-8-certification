/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 21/08/18
 */
public class TestClass18 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        System.out.println(l);
        l.add("three");
        String s=sl.collect(Collectors.joining(" "));
        //l.add("three");
        System.out.println(s);
        System.out.println(l);

    }
}
