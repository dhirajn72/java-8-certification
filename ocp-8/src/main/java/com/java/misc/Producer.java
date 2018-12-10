/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 04/12/18
 */
public class Producer implements Runnable {

    private ProducerConsumer producer;

    public Producer(ProducerConsumer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            producer.produce(i);
    }
}
