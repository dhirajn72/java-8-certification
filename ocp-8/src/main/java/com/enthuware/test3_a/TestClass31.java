/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 05/09/18
 */
public class TestClass31 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(4);
        CyclicBarrier barrier=new CyclicBarrier(4);
        TestCyclicBarrier testCyclicBarrier= new TestCyclicBarrier();
        for (int i=0; i<8;i++)
            service.submit(()->testCyclicBarrier.performTasks(barrier));
        service.shutdown();
    }
}
class TestCyclicBarrier{
    public void performTasks(CyclicBarrier barrier){
        try {
            barrier.await();
            preTasks();
            barrier.await();
            tasks();
            barrier.await();
            postTasks();
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public void preTasks(){
        System.out.println("preTasks()");
    }public void tasks(){
        System.out.println("tasks()");
    }public void postTasks(){
        System.out.println("postTasks()");
    }
}