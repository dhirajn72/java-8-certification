/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class ArraySum extends RecursiveTask<Integer> {
    private int[] arr;
    private int low;
    private int high;

    public ArraySum(int[] arr, int low, int high) {
        this.arr = arr;
        this.high = high;
        this.low = low;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++)
            arr[i]=i;
        ArraySum arraySum = new ArraySum(arr, 0, arr.length);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        int sum = pool.invoke(arraySum);
        System.out.println("Sum is:>>>>"+sum);
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        //System.out.println(Thread.currentThread().getId()+"::"+Thread.currentThread().getName());
        if (high-low < 2 ) {
            for(int i=low;i<high;i++){
                sum+=arr[i];
            }
            return sum;
        } else {
            int middle = low + ((high - low) / 2);
            RecursiveTask<Integer> task=new ArraySum(arr,low,middle);
            task.fork();
            return new ArraySum(arr,middle,high).compute()+task.join();
        }
    }
}
