/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author Dhiraj
 * @date 05/09/18
 */
public class TestClass27 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool pool = ForkJoinPool.commonPool();
        long result = pool.invoke(new MyAction(arr, 0, arr.length));
        System.out.println(result);
        //System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    }
}


class MyAction extends RecursiveTask<Long> {

    private int[] arr;
    private int low;
    private int high;

    public MyAction(int[] arr, int start, int end) {
        this.arr = arr;
        this.low = start;
        this.high = end;
    }

    @Override
    protected Long compute() {
        if (high - low > 3) {
            long sum = 0;
            for (int i = low; i < high; i++)
                sum += arr[i];
            return sum;
        } else {
            int mid = low + (high - low) / 2;
            MyAction left = new MyAction(arr, low, mid);
            MyAction right = new MyAction(arr, mid, high);
            left.fork();
            return right.compute() + left.join();
        }
    }
}