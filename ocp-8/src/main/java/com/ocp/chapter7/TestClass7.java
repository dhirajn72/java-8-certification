/*
 * All Rights Reserved @Dhiraj
 */

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
 * @date 15/07/18
 */
public class TestClass7 {

    public static void main(String[] args) {

        ExecutorService service = null;
        try {
            //service = Executors.newFixedThreadPool(2);
            service = Executors.newFixedThreadPool(4);
            TestClass7 manager = new TestClass7();

            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("******Pen cleaned!!!"));

            for (int i = 0; i < 4; i++)
            //service.submit(()->manager.performTask(c1, c2));
                service.submit(()->manager.performTask(c1, c1));


        } finally {
            if (service != null) service.shutdown();
        }
    }

    private void removeAnimals() {
        System.out.println("Removing Animals");
    }

    private void cleanPen() {
        System.out.println("Cleaning Pens");
    }

    private void addAnimal() {
        System.out.println("Adding Animals");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeAnimals();
            c1.await();
            cleanPen();
            c2.await();
            addAnimal();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
