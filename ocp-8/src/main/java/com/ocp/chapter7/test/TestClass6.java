/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7.test;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 31/08/18
 */
public class TestClass6 {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> blockingDeque=new LinkedBlockingDeque<>();
        new TestClass6().addAndPrint(blockingDeque);
    }

    public void addAndPrint(BlockingDeque<Integer> deque) throws InterruptedException {
        deque.offer(103);
        deque.offerFirst(20,1, TimeUnit.SECONDS);
        deque.offerLast(85,1, TimeUnit.SECONDS);
        System.out.print(deque.pollFirst(2,TimeUnit.SECONDS));
        System.out.println(" "+deque.pollLast(1,TimeUnit.SECONDS));

    }
}
