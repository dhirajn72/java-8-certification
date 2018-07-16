/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class Consumer implements Runnable{
    ProducerConsumer producerConsumer;
    public Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
            producerConsumer.consume();
    }
}
