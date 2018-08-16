/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.*;

/**
 * @author Dhiraj
 * @date 11/08/18
 */
public class TestClass8 {

    public static void main(String[] args) {

        //List<String> strings= new Stack<>();

        // push(), pop(), peek() are the stack operations
        Stack<String> strings= new Stack<>();
        strings.add("x");
        strings.add("y");
        strings.push("d");
        strings.push("f");
        strings.push("g");
        System.out.println(strings);
        System.out.println(strings.pop());

        System.out.println("*****");
        // add(),offer(),peek(),poll() are the queue operations
        Queue<String> queue= new LinkedList<>();
        queue.add("x");
        queue.add("y");
        queue.offer("d");
        queue.offer("f");
        queue.offer("g");
        System.out.println(queue);
    }
}
