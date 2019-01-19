/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author Dhiraj
 * @date 16/01/19
 */
public class ForkJoinTest {
    public static void main(String[] args) {
        ForkJoinPool pool=new ForkJoinPool(6);
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        long result=pool.invoke(new TestClassTask(arr,0,arr.length));
        System.out.println(result);
    }
}

class TestClassTask extends RecursiveTask<Long>{

    private int[] arr;
    private int high;
    private int low;


    public TestClassTask(int[] arr, int low,int high){
        this.arr=arr;
        this.high=high;
        this.low=low;
    }

    @Override
    protected Long compute() {
        if (high-low<3){
            long sum=0;
            for (int i=low;i<high;i++)
                sum+=arr[i];
            return sum;
        }
        else {
            int mid=low+(high-low)/2;
            TestClassTask task1=new TestClassTask(arr,low,mid);
            TestClassTask task2=new TestClassTask(arr,mid,high);
            task1.fork();
            return task2.compute()+task1.join();
        }
    }
}
