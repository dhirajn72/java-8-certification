/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author Dhiraj
 * @date 02/08/18
 */
public class TestClass19 {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = null;
        boolean flag=true;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> integerFuture = service.submit(() -> {
                int i = 0;
                while (flag) {
                    //System.out.println(i);
                }
                return i;
            });
        } finally {
            if (service != null) service.shutdown();
        }
        if (service != null) {
            boolean b=service.awaitTermination(1, TimeUnit.SECONDS);
            System.out.println(b);
            if (service.isTerminated()) {
                System.out.println("All tasks finished !!");
            } else {
                System.out.println("At least one task is still running!");
            }
        }
    }
}
