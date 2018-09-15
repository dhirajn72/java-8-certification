/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 15/09/18
 */
public class TestClass11 {
    public static void main(String[] args) {

        Stream.generate(()->"elsa")
                .filter(x->x.length()==4)
                .limit(2)
                .sorted()// Keep throwing me values and let me know to sort once you're done !
                //.limit(2) //Let me know when to pick 2 elements,
                .peek(x-> System.out.println(x +" wont execute ever"))
                .forEach(System.out::println);

    }
}
