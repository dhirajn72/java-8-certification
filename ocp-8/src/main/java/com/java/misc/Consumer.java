/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 04/12/18
 */
public class Consumer implements  Runnable{
    private ProducerConsumer consumer;

    public Consumer(ProducerConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        consumer.consume();
    }
}
