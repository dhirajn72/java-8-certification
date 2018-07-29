/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 27/07/18
 */
public class TestClass8 {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("monkey","2","chimp");
        Predicate<String> predicate=(x)->Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(predicate));
        System.out.println(list.stream().allMatch(predicate));
        System.out.println(list.stream().noneMatch(predicate));

        Stream<String> infinite=Stream.generate(()->"chimp");
        //System.out.println(infinite.anyMatch(predicate));
        //System.out.println(infinite.noneMatch(predicate));
        //System.out.println(infinite.allMatch(predicate)); // Be careful, press CTRL+Z







    }
}
