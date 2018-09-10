/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Dhiraj
 * @date 02/09/18
 */

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(5000);
        return "DONE";
    }
}
public class TestClass16 {

    public static void main(String[] args) throws Exception {
        ExecutorService es =  Executors.newSingleThreadExecutor();
        //ExecutorService es =  Executors.newFixedThreadPool(2);

        Future<String> future = es.submit(new MyCallable());
        System.out.println(future.get()); //1
        es.shutdownNow(); //2
        System.out.println("main exits");
    }
}
