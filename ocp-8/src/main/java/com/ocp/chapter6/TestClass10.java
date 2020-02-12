/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class TestClass10 {

    public  void method1(){
        System.out.println("method1()->"+Thread.currentThread().getName());
        //System.out.println("1->"+Thread.currentThread().getName());
    }
    public  void method2(){
        System.out.println("method2()->"+Thread.currentThread().getName());
        //System.out.println("2->"+Thread.currentThread().getName());
    }
    public  void method3(){
        System.out.println("method3->"+Thread.currentThread().getName());
        //System.out.println("3->"+Thread.currentThread().getName());
    }

    public void performTask(CyclicBarrier barrier) throws BrokenBarrierException, InterruptedException {
        //barrier.await();
        method1();
        barrier.await();
        method2();
        barrier.await();
        method3();
        barrier.await();
        //barrier.reset();
        System.out.println(barrier.isBroken());
    }

    public static void main(String[] args) {
        TestClass10 t= new TestClass10();

        CyclicBarrier barrier=new CyclicBarrier(3);
        //ExecutorService service= Executors.newFixedThreadPool(2);
        ExecutorService service= Executors.newFixedThreadPool(3);

        for (int i=1;i<7;i++)
            //service.submit(()->t.performTask());
            service.submit(() -> {
                try {
                    t.performTask(barrier);
                } catch (BrokenBarrierException e) {
                    System.out.println(e);
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        if (service!=null)
            service.shutdown();
        //barrier.reset();
       // System.out.println(barrier.isBroken());

    }
}
