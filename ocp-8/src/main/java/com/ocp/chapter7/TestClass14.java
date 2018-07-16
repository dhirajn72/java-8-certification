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
 * @date 15/07/18
 */
public class TestClass14  {
    public static void main(String[] args) {

        Double[] weighs=new Double[10];

        ForkJoinTask<?> task= new WeightAnimal(weighs,0,weighs.length);
        ForkJoinPool pool=new ForkJoinPool();
        pool.invoke(task);
        System.out.println("****");
        Arrays.asList(weighs).stream().forEach(d-> System.out.println(d.intValue()+" "));
    }
}


class WeightAnimal extends RecursiveAction{

    private int start;
    private int end;
    private Double[] weight;

    public WeightAnimal(Double[] weight,int start, int end) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    protected void compute() {
       // System.err.println("Compute called!!!!!");
        if (end-start<=3)
            for (int i=start;i<end;i++){
            weight[i]=(double)new Random().nextInt(100);

                System.out.println("Animal weighed::"+i);
            }
        else{
            int middle=start+((end-start)/2);
            System.out.println("[start="+start+",middle="+middle+",end="+end+"]");
            invokeAll(new WeightAnimal(weight,start,middle),new WeightAnimal(weight,middle,end));
        }
    }
}