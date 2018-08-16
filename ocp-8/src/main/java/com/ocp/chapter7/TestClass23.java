/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 03/08/18
 */
public class TestClass23 {
    public static void main(String[] args) {

        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
            blockingDeque.offer(23);
            blockingDeque.offer(73);
            blockingDeque.offer(83);
            blockingDeque.offer(43);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);
            blockingDeque.stream().forEach((x) -> System.out.println(x));

        } catch (InterruptedException e) {

        }
    }
}
