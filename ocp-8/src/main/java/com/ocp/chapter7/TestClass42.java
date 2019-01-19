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
 * @date 11/01/19
 */
public class TestClass42 {
    public static void main(String[] args) {
        int threads=4;
        ExecutorService service= Executors.newFixedThreadPool(threads);
        TestClass42A obj= new TestClass42A();
        CyclicBarrier barrier= new CyclicBarrier(threads);
        for (int i=threads;i>0;i--)
            service.submit(()->obj.performTask(barrier));
        service.shutdown();
    }
}

class TestClass42A {
    public void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }

    public void m3() {
        System.out.println("m3");
    }

    public void m4() {
        System.out.println("m4");
    }

    public  void performTask(CyclicBarrier barrier){
        try {
            m1();
            barrier.await();
            m2();
            barrier.await();
            m3();
            barrier.await();
            m4();
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
