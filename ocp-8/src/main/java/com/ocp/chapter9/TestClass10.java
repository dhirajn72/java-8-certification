/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 14/09/18
 */
public class TestClass10 {
    public static void main(String[] args) {

        Locale locale= new Locale("en","US");
        ResourceBundle bundle=ResourceBundle.getBundle("com.ocp.chapter9.Zoo",locale);
        //System.out.println(bundle.getObject("a"));
        //bundle.keySet().stream().forEach(x-> System.out.println(bundle.getObject(x)));

        List<String> list= Arrays.asList();
        List<String> list1= Arrays.asList("a","b","c","d");
        List<String> list2= Arrays.asList("apple","ball","cat","dog");

        Stream<List<String>> stream= Stream.of(list,list1,list2);
        //stream.flatMap(x->x.stream()).forEach(System.out::println);
        stream.flatMap(x->Stream.of(x)).forEach(System.out::println);

        list2.stream().filter(x->x.length()==3).sorted().collect(Collectors.toList()).stream().forEach(System.out::println);

        int a=10;
        int b=20;

        a=a+b; // 30
        b=a-b;// 10
        a=a-b;
        System.out.println(a+" "+b);
    }
}
