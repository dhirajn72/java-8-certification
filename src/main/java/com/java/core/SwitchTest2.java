/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Dhiraj
 * @date 24/05/18
 */
public class SwitchTest2 {
    public static void main(String[] args) {

        final String s="bob";
        String x="";
        switch (x){
            //case s:  case value must be compile time constant, If final is removed from s, compilation fails
        }
        new Thread(()->{
            System.out.println("Thread starts!!");
        }).start();

        ThreadPoolExecutor executor= (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
            for (int i=0;i<1000;i++){
                executor.submit(()->{
                    System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
                });
            }
        executor.shutdown();
    }
}
