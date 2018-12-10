/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 04/12/18
 */
public class ProducerConsumer {
    int data;
    boolean flag=false;
    public synchronized void produce(int data)  {
        if (flag){
            try {
                wait(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data=data;
        System.out.println("Produced::"+data);
        sleep();
        flag=true;
        notifyAll();
    }

    private void sleep() {
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){e.printStackTrace();}
    }
    public synchronized void consume()  {
        if (!flag){
            try {
                wait(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed::"+ data--);
        sleep();
        flag=false;
        notifyAll();
    }
}


