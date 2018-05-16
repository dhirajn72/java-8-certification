/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 16/05/18
 */
public class Test2 {
    public static void main(String[] args) {

        List<StringBuilder> s = new ArrayList<>();
        s.add(new StringBuilder("Zeplin"));
        s.add(new StringBuilder("apple"));
        s.add(new StringBuilder("nest"));
        s.add(new StringBuilder("catie"));
        s.add(new StringBuilder("parot"));
        s.add(new StringBuilder("xmas"));

        System.out.println("Before sorting::");
        s.forEach(element -> System.out.println(element));
        Collections.sort(s, (o1, o2) -> {
            return o1.toString().compareTo(o2.toString());
        });
        System.out.println("*******");
        System.out.println("After sorting::");
        s.forEach(element -> System.out.println(element));
        System.out.println("Using executors***");
        ExecutorService service = Executors.newFixedThreadPool(100);
        service.execute(() -> s.forEach(e -> System.out.println(e)));
        service.shutdown();
        //new Thread(()->s.forEach(e-> System.out.println(e))).start();

        System.out.println("*****");

        s.sort(Comparator.comparing(p -> p.hashCode()));
        System.out.println("****");
        s.forEach(element -> System.out.println(element));
    }
}
