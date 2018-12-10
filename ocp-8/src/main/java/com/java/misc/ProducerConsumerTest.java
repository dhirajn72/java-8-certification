/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 04/12/18
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer= new ProducerConsumer();
        new Thread(new Producer(producerConsumer)).start();
        new Thread(new Consumer(producerConsumer)).start();
    }
}
