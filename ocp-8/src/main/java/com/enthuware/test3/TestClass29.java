/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 11/09/18
 */
public class TestClass29 {
    static Object ob1 = new Object();
    static Object ob2 = new Object();

    public static void main(String[] args) {

        Path p1 = Paths.get("/users/test/../../test2/file1.txt");
        Path p2 = Paths.get("/users/test1/file2.txt");

        System.out.println(p2.relativize(p1)); //       ../../../users1/test1/file2.txt
        System.out.println(p1.normalize());

        ExecutorService service = Executors.newFixedThreadPool(5);
        int i = 0;
        for (; i < 100; i++) ;
        service.execute(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        service.execute(() -> {
            synchronized (ob1) {
                sleep();
                System.out.println("Locked 1");
                synchronized (ob2) {
                    System.out.println("waiting ob2");

                }
            }
        });
        service.execute(() -> {
            synchronized (ob2) {
                sleep();
                System.out.println("Locked 2");
                synchronized (ob1) {
                    System.out.println("waiting ob1");
                }
            }
        });

        service.shutdown();
    }
    private static void sleep() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
