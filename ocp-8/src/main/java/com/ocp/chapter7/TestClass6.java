/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 15/07/18
 */
public class TestClass6 {

    private void removeAnimals(){
        System.out.println("Removing Animals");

    }
    private void cleanPen(){
        System.out.println("Cleaning Pens");

    }
    private void addAnimal(){
        System.out.println("Adding Animals");

    }

    public void performTask(){
        removeAnimals();
        cleanPen();
        addAnimal();
    }

    public static void main(String[] args) {

        ExecutorService service=null;
        try {
            service= Executors.newFixedThreadPool(4);
            TestClass6 manager= new TestClass6();
            for (int i=0;i<4;i++)
                service.submit(()->manager.performTask());

        }finally {
            if (service!=null)service.shutdown();
        }
    }
}
