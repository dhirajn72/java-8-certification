/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.concurrent.ForkJoinPool;

/**
 * @author Dhiraj
 * @date 29/08/18
 */
public class TestClass12 {
    public static void main(String[] args) {

        ForkJoinPool pool= new ForkJoinPool(20);
        ForkJoinPool pool1=ForkJoinPool.commonPool();
        System.out.println(pool1.getPoolSize());
        System.out.println(pool.getPoolSize());
    }
}
