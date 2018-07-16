/*
 * All Rights Reserved @Dhiraj
 */

/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author Dhiraj
 * @date 15/07/18
 */
public class TestClass15 {
    public static void main(String[] args) {

        Double[] weighs = new Double[10];

        ForkJoinTask<Double> task = new WeightAnimal1(weighs, 0, weighs.length);
        ForkJoinPool pool = new ForkJoinPool();
        Double sum =pool.invoke(task);
        System.out.println("****");
        System.out.println(sum);
        final int[] addAll = {0};
        Arrays.asList(weighs).stream().forEach((x)->{
            addAll[0] +=x;
        });
        System.out.println(Arrays.toString(addAll));
    }
}


class WeightAnimal1 extends RecursiveTask<Double> {

    private int start;
    private int end;
    private Double[] weight;

    public WeightAnimal1(Double[] weight, int start, int end) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    protected Double compute() {
        // System.err.println("Compute called!!!!!");
        double sum = 0;
        if (end - start <= 3) {
            for (int i = start; i < end; i++) {
                weight[i] = (double) new Random().nextInt(100);
                System.out.println("Animal weighed::" + i);
                sum += weight[i];
            }
            return sum;
        } else {
            int middle = start + ((end - start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
            //invokeAll(new WeightAnimal1(weight, start, middle), new WeightAnimal1(weight, middle, end));
            RecursiveTask<Double> otherTask=new WeightAnimal1(weight,start,middle);
            otherTask.fork();
            return new WeightAnimal1(weight,middle,end).compute()+otherTask.join();
        }
    }
}