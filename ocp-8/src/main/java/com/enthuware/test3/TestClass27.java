/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 * @author Dhiraj
 * @date 05/09/18
 */
public class TestClass27 {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        ForkJoinTask forkJoinTask= new MyAction(arr,0,arr.length);
        ForkJoinPool pool= ForkJoinPool.commonPool();
        pool.invoke(forkJoinTask);
        System.out.println(forkJoinTask.join());;
    }
}



class MyAction extends RecursiveAction{

    private int[] arr;
    private int start;
    private int end;

    public MyAction(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (this.arr.length>3) {
            System.out.println("called !!");
            List<MyAction> myActions = new ArrayList<>();
            myActions = createSubTasks();
            for(RecursiveAction action:myActions) {
                action.fork();
            }
        }
        else {
            System.out.println("doing my task");
            int sum=0;
            for (int x:arr)
                sum+=x;
            System.out.println(sum);
        }
    }
    private List<MyAction> createSubTasks() {
        System.out.println("called createSubTasks()");
        List<MyAction> myActions= new ArrayList<>();
        MyAction action= new MyAction(arr,0,arr.length/2);
        MyAction action1= new MyAction(arr,(arr.length/2)+1,arr.length);
        myActions.add(action);
        myActions.add(action1);
        return myActions;
    }
}