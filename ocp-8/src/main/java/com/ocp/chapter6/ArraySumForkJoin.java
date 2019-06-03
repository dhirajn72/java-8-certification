/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author Dhiraj
 * @date 03/06/19
 */
public class ArraySumForkJoin extends RecursiveTask<Integer> {
    private int high;
    private int low;
    private int[] arr;

    public ArraySumForkJoin(int low, int high, int[] arr) {
        this.high = high;
        this.low = low;
        this.arr = arr;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        ArraySumForkJoin arraySumForkJoin = new ArraySumForkJoin(0, arr.length, arr);
        ForkJoinPool pool = new ForkJoinPool(50);
        //int sum = pool.invoke(arraySumForkJoin);
        //System.out.println(sum);
        ForkJoinTask sum=pool.submit(arraySumForkJoin);
        System.out.println(sum.get());
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (high - low < 2) {
            for (int i = low; i < high; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            int middle = low + ((high - low) / 2);
            RecursiveTask<Integer> task = new ArraySumForkJoin(low, middle, arr);
            task.fork();
            return new ArraySumForkJoin(middle, high, arr).compute() + task.join();

        }
    }
}
