/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.io.IOException;
import java.util.concurrent.*;

/**
 * @author Dhiraj
 * @date 13/07/18
 */
public class TestClass2 {
    private static int counter;
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        ExecutorService service=null;

        try{
            service= Executors.newSingleThreadExecutor();
//            Future<?> result=service.submit(()->{ for (int i=0;i<500;i++) TestClass2.counter++; });
            Future<Integer> result=service.submit((Callable<Integer>) ()->{
                for (int i=0;i<500;i++)
                    throw new IOException();
                return 10;
            });
            Object o=result.get(10, TimeUnit.SECONDS);
            System.out.println("ends");
            System.out.println(o+" "+counter);
        }
        catch (TimeoutException  e){
            e.printStackTrace();
        }
        finally {
            if (service!=null)service.shutdown();
        }
    }
}
