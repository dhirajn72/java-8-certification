/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 07/09/18
 */
public class TestClass34 {
    public static void main(String[] args) {

        Stream<String> stream= Stream.of("w","o","l","f");
        //stream.parallel().reduce((a,b)->a+b).ifPresent(System.out::print);
        //String res=stream.parallel().reduce("x",(a,b)->a+b);

        String res=stream.parallel().reduce("x",(a,b)->a+b,(a,b)->a+b);
        System.out.println(res);



    }
}
