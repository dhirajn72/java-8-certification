/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4.test;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass3 {
    public static void main(String[] args) {
        Predicate<? super String> predicates= s->s.length()>3;
        Stream<String> stream=Stream.iterate("-",(s)->s+s);
        boolean b1=stream.noneMatch(predicates);
        boolean b2=stream.anyMatch(predicates);
        System.out.println(b1+" "+b2);
    }
}
