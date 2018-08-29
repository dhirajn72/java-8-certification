/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * @author Dhiraj
 * @date 29/08/18
 */
public class TestClass17 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService service= Executors.newFixedThreadPool(2);
        Future<?>  runnableFuture= service.submit( ()-> {while (true);});
        System.out.println(runnableFuture.get(10, TimeUnit.SECONDS));
        //System.out.println(runnableFuture.get(10, TimeUnit.SECONDS));

        if (!Objects.isNull(service))
            service.shutdown();
    }
}
