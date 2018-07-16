/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class TestClass12 {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer= new ProducerConsumer();

        /**
         *
         * Without ExecutorSaervice framework!
         */
        /*new Thread(new Producer(producerConsumer)).start();
        new Thread(new Consumer(producerConsumer)).start();*/

        /**
         *
         * Using ExecutorService framework !
         */
        ExecutorService service= Executors.newFixedThreadPool(2);
        service.execute(new Producer(producerConsumer));
        service.execute(new Consumer(producerConsumer));
        if (service!=null)
            service.shutdown();
    }
}
