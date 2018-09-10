/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import com.ocp.chapter7.Consumer;

import java.util.function.Supplier;

/**
 * @author Dhiraj
 * @date 05/09/18
 */
public class TestClass30 {
    public static void main(String[] args) throws InterruptedException {
        Supplier<Thread>  threadSupplier=()->new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t1=threadSupplier.get();
        Thread t2=threadSupplier.get();
        Thread t3=threadSupplier.get();

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        System.out.println(Thread.currentThread().getName()+" terminates !!");
    }
}

