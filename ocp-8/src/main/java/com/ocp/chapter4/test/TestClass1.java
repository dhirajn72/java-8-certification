/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter4.test;

import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        Stream<String> stream=Stream.iterate("",s->s+"1");
        System.out.println(stream.limit(2).map(x->x+"2"));
    }
}
