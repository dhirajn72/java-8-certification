/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

/**
 * @author Dhiraj
 * @date 14/07/18
 */
public class ProducerConsumer {
    private boolean flag=false;
    private int data;
    public synchronized void produce(int x) {

        if (flag){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.data=x;
        System.out.println("Produced::"+data);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        flag=true;
        notify();
    }

    public synchronized void consume(){

        if (!flag){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumed::"+data--);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        flag=false;
        notify();
    }
}