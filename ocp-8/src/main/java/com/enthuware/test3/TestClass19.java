/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 21/08/18
 */
public class TestClass19 {
    public static void main(String[] args) {
        Stream<Integer> integerStream= Stream.of(2,3,4,5,6);
        //integerStream.reduce((a,b)->a+b).ifPresent(System.out::println);
        IntStream intStream= integerStream.mapToInt(x->x);
        intStream.average().ifPresent(System.out::println);

        List<String> list= Arrays.asList();
        List<String> list1= Arrays.asList("a","b","c");
        List<String> list2= Arrays.asList("apple","ball","cat");
        List<String> list3= Arrays.asList("dog","elephant","fish");
        Stream<List<String>> listStream=Stream.of(list,list1,list2,list3);

        //listStream.flatMap(l->l.stream()).reduce((a,b)->a.concat(b)).ifPresent(System.out::println);

        String str="My name is dhiraj";
        String reversed=reverseString(str);
        System.out.println(reversed);
    }

    private static String reverseString(String str) {
        String[] strings=str.split(" ");

        //Using string builder
        /*StringBuilder builder= new StringBuilder();
        for (int i=strings.length-1;i>=0;i--)
            builder.append(strings[i]).append(" ");
        return builder.substring(0,builder.length()-1).toString();*/

        //Using string
        String res="";
        for (int i=strings.length-1;i>=0;i--)
            res+=strings[i]+" ";
        return res.substring(0,res.length()-1);
    }
}