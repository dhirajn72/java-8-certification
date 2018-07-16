/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList();
        queue.add(56);
        queue.add(34);
        queue.add(87);
        queue.add(13);
        System.out.println(queue);
        queue.offer(11);
        System.out.println(queue);
        queue.offerFirst(22);
        queue.offerLast(33);
        System.out.println(queue);
        System.out.println("********");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());
        System.out.println(queue.offerFirst(44));
        System.out.println(queue.offerLast(55));
        queue.push(66);
        System.out.println(queue);
    }
}