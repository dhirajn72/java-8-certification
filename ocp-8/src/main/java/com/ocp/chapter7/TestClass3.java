/*
 * All Rights Reserved @Dhiraj
 */

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
public class TestClass3 {
    private static int counter;
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        ExecutorService service=null;

        try{
            service= Executors.newSingleThreadExecutor();
//            Future<?> result=service.submit(()->{ for (int i=0;i<500;i++) TestClass2.counter++; });
            Future<Integer> result=service.submit(()->{
                return 30+40;
            });
            System.out.println("ends");
            System.out.println(result.get());
        }

        finally {
            if (service!=null)service.shutdown();
        }
    }
}
