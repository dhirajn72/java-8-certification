/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @author Dhiraj
 * @date 30/08/18
 */


public class MyRecursiveAction extends RecursiveAction {

    private long workLoad = 0;

    public MyRecursiveAction(long workLoad) {
        this.workLoad = workLoad;
    }

    public static void main(String[] args) {
        MyRecursiveAction myRecursiveAction = new MyRecursiveAction(100);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        pool.invoke(myRecursiveAction);
    }

    @Override
    protected void compute() {
        //if work is above threshold, break tasks up into smaller tasks
        if (this.workLoad > 2) {
            System.out.println("Splitting workLoad : " + this.workLoad);
            List<MyRecursiveAction> subtasks = new ArrayList<>();
            subtasks.addAll(createSubtasks());
            for (RecursiveAction subtask : subtasks) {
                //subtask.fork();
                subtask.invoke();
            }

        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
        }
    }

    private List<MyRecursiveAction> createSubtasks() {
        List<MyRecursiveAction> subtasks = new ArrayList<MyRecursiveAction>();
        MyRecursiveAction subtask1 = new MyRecursiveAction(this.workLoad / 2);
        //MyRecursiveAction subtask2 = new MyRecursiveAction(this.workLoad / 2);
        subtasks.add(subtask1);
        //subtasks.add(subtask2);
        return subtasks;
    }
}