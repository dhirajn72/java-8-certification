/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayDeque;

/**
 * @author Dhiraj
 * @date 26/07/18
 */
public class TestClass17 {
    public static void main(String[] args) {

        ArrayDeque<String> strings= new ArrayDeque<>();
        strings.push("hello");
        strings.push("hi");
        strings.push("ola");
        System.out.println(strings.pop());
        System.out.println(strings.peek());
        System.out.println("****");
        while (strings.peek()!=null)
            System.out.print(strings.pop());


    }
}
