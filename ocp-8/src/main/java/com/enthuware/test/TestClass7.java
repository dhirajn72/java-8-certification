/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Dhiraj
 * @date 11/08/18
 */

public class TestClass7 {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.offerLast(2);
        d.push(3);
        d.peekFirst();
        d.removeLast();
        d.pop();
        System.out.println(d);
    }
}