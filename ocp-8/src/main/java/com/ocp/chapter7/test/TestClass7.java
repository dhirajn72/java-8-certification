/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 31/08/18
 */
public class TestClass7 {
    public static void await(CyclicBarrier cb){
        try {
            cb.await();
        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        //CyclicBarrier cb=new CyclicBarrier(10,()-> System.out.println("Stock room full !"));
        //IntStream.iterate(1,i->1).limit(9).parallel().forEach(i->await(cb));
        System.out.println("****");
        Stream.iterate(50,i->i+1).limit(50).forEach(System.out::println);
        Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);
    }

}
