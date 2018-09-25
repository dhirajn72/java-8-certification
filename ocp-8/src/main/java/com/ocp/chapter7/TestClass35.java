/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class TestClass35 {
    public static void main(String[] args) {
        int threads = 4;
        ExecutorService service = Executors.newFixedThreadPool(threads);
        Test35A a = new Test35A();
        CyclicBarrier barrier= new CyclicBarrier(threads);
        for (int i = 0; i <5; i++)
            service.submit(()->a.performTasks(barrier));

        service.shutdown();
    }
}


class Test35A {
    public void task1() {
        System.out.println("task1");
    }

    public void task2() {
        System.out.println("task2");
    }

    public void task3() {
        System.out.println("task3");
    }

    public void task4() {
        System.out.println("task4");
    }

    public void performTasks(CyclicBarrier barrier) {

        try {
            task1();
            int x=barrier.await();
            task2();
            System.out.println(x);
            x=barrier.await();
            task3();
            System.out.println(x);
            x=barrier.await();
            task4();
            System.out.println(x);
            System.out.println(barrier.isBroken());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}