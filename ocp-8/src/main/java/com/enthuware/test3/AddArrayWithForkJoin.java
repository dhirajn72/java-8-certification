/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author Dhiraj
 * @date 14/01/19
 */
public class AddArrayWithForkJoin {
    public static void main(final String[] arguments) throws InterruptedException,
            ExecutionException {

        int nThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(nThreads);

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool(nThreads);
        Long result = forkJoinPool.invoke(new Sum(numbers,0,numbers.length));
        System.out.println(result);
    }

    static class Sum extends RecursiveTask<Long> {
        int low;
        int high;
        int[] array;

        Sum(int[] array, int low, int high) {
            this.array = array;
            this.low   = low;
            this.high  = high;
        }

        @Override
        protected Long compute() {
            if(high - low <= 3) {
                long sum = 0;
                for(int i = low; i < high; ++i)
                    sum += array[i];
                return sum;
            } else {
                int mid = low + (high - low) / 2;
                Sum left  = new Sum(array, low, mid);
                Sum right = new Sum(array, mid, high);
                left.fork();
                return right.compute() + left.join();
            }
        }
    }
}
