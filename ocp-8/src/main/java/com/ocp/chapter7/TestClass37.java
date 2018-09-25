/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * @author Dhiraj
 * @date 17/09/18
 */
public class TestClass37 {
    public static void main(String[] args) {
        Double[] weights=new Double[10];
        ForkJoinTask<?> task= new WeightAnimalAction(weights,0,weights.length);
        ForkJoinPool pool= new ForkJoinPool();
        pool.invoke(task);
        Arrays.asList(weights).stream().forEach(x->System.out.print(x+" "));
    }
}



class WeightAnimalAction extends RecursiveAction{
    private Double[] weights;
    private int start;
    private int end;

    public WeightAnimalAction(Double[] weights, int start, int end) {
        this.weights = weights;
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {

        if ((end-start)<=3){
            for(int i=start;i<end;i++){
                weights[i]=(double)new Random().nextInt(100);
                System.out.println("Animal weighed: "+i);
            }
        }
        else {
            int middle=start+((end-start)/2);
            System.out.println("[start=" +start+",middle="+middle+",end="+end+"]");
            invokeAll(new WeightAnimalAction(weights,start,middle),new WeightAnimalAction(weights,middle,end));

        }
    }
}