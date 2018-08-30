/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class WeightAnimalAction  extends RecursiveAction{

    private int start;
    private int end;
    private Double[] weight;

    public WeightAnimalAction(Double[] weight,int start, int end ) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    protected void compute() {
        if (end-start<=3){
            for (int i=start;i<end;i++){
                weight[i]=(double)new Random().nextInt(100);
                System.out.println("Animal weighed:"+i);
            }
        }
        else {
            int middle=start+((end-start)/2);
            System.out.println("[start="+start+",middle="+middle+",end="+end+"]");
            invokeAll(new WeightAnimalAction(weight,start,middle),new WeightAnimalAction(weight,middle,end));

        }
    }
    public static void main(String[] args) {
        Double[] weights= new Double[10];
        ForkJoinTask<?> task=new WeightAnimalAction(weights,0,weights.length);
//        ForkJoinPool pool=ForkJoinPool.commonPool();
        ForkJoinPool pool=new ForkJoinPool();
        pool.invoke(task);
        System.out.println();
        Arrays.asList(weights).stream().forEach(x-> System.out.print(x.doubleValue()+", "));
    }
}
