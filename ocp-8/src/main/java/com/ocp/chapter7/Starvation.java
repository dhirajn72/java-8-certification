/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 15/07/18
 */
public class Starvation {
    public static void main(String[] args) {
        final Worker worker = new Worker();

        /**
         * using executors
         */
        ExecutorService service= Executors.newFixedThreadPool(7);
        for (int i = 0; i < 10; i++)
            service.submit(()->worker.work());

        /**
         * traditional way
         */
        /*for (int i = 0; i < 10; i++)
            new Thread(()->worker.work()).start();*/

    }
}
