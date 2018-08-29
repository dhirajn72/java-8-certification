/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import com.mysql.fabric.xmlrpc.base.Array;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 22/08/18
 */
public class TestClass21 {
    public static void main(String[] args) {
        //IntStream intStream=IntStream.iterate(1,i->i+1);
        IntStream intStream=IntStream.range(1,10);
        //IntStream intStream=IntStream.rangeClosed(1,10);
        //intStream.forEach(System.out::println);

        DoubleStream doubleStream=DoubleStream.iterate(1,i->i+1);
        Stream<Double> stream=doubleStream.limit(10).mapToObj(x->x);
        //stream.forEach(System.out::println);
        //IntStream integerIntStream= stream.mapToInt(x->Double.valueOf(x).intValue());
        //integerIntStream.forEach(System.out::println);
        //LongStream longStream=integerIntStream.mapToLong(x->x);
        //longStream.forEach(System.out::println);

        //stream.flatMapToDouble(x->DoubleStream.of(x)).forEach(System.out::println);
        ArrayList<Integer> integers=stream.flatMapToInt(x->IntStream.of(Double.valueOf(x).intValue())).collect(()->new ArrayList(),ArrayList::add,ArrayList::addAll);
        integers.forEach(System.out::println);
    }
}


class Test{
    private int id;
    private String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}