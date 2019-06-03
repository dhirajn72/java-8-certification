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
        int threads = 10;
        ExecutorService service = Executors.newFixedThreadPool(threads);
        Test35A task = new Test35A();
        CyclicBarrier barrier = new CyclicBarrier(threads);
        for (int i = 0; i < 10; i++)
            service.submit(() -> task.performTasks(barrier));
        service.shutdown();
    }
}

class Test35A {
    public void task1() {
        System.out.println("task1 ->" + Thread.currentThread().getName());
    }

    public void task2() {
        System.out.println("task2 ->" + Thread.currentThread().getName());
    }

    public void task3() {
        System.out.println("task3 ->" + Thread.currentThread().getName());
    }

    public void task4() {
        System.out.println("task4 ->" + Thread.currentThread().getName());
    }

    public void performTasks(CyclicBarrier barrier) {
        try {
            task1();
            barrier.await();// At this point first thread will be waiting for other three threads, once four completes,it will execute the next statement
            task2();
            barrier.await();// At this point first thread will be waiting for other three threads, once four completes,it will execute the next statement
            task3();
            barrier.await();// At this point first thread will be waiting for other three threads, once four completes,it will execute the next statement
            task4();
            barrier.await();// At this point first thread will be waiting for other three threads, once four completes,it will execute the next statement
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}