/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass11 {
    public static void main(String[] args) {
        ArrayDeque<String> greetings=new ArrayDeque<>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek()!=null)
            System.out.print(greetings.pop());


        System.out.println("*****");
        Map<String,Double> map= new HashMap<>();
    }
}
