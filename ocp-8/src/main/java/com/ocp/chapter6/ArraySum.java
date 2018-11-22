/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

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
        //int[] arr = new int[]{2, 3, 4, 5, 6};

        int[] arr = new int[100];
        for (int i=0;i<arr.length;i++)
            arr[i]=i;
        ArraySum arraySum = new ArraySum(arr, 0, arr.length);
        ForkJoinPool pool = ForkJoinPool.commonPool();

        System.out.println();
        //Instant before=Instant.now();
        long before=System.currentTimeMillis();
        //System.out.println(Arrays.asList(arr).stream().mapToInt(x -> { int res = 0;for (int y : x) res += y;return res; }).sum());
        //System.out.println(Arrays.asList(arr).parallelStream().mapToInt(x -> { int res = 0;for (int y : x) res += y;return res; }).sum());
        int sum = pool.invoke(arraySum);
        System.out.println(">>>>"+sum);
        //Instant later=Instant.now();
        long later=System.currentTimeMillis();
        //System.out.println(Duration.between(before,later));
        System.out.println(TimeUnit.MICROSECONDS.toNanos(later-before));
    }

    @Override
    protected Integer compute() {
        System.out.println("compute called!!!");
        int sum = 0;
        if (arr.length >= 3) {
            for (int i : this.arr) {
                sum += i;
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
