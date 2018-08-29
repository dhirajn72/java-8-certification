/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;

/**
 * @author Dhiraj
 * @date 25/08/18
 */
public class TestClass26 {
    Map<String, List<Double>> groupedValues = new HashMap<>();

    public static void main(String[] args) {
        DoubleStream is = DoubleStream.of(0, 2, 4); //1
        double sum = is.filter( i->i%2 != 0 ).sum(); //2
        System.out.println(sum); //3
    }

    public void process1(String name, Double value){
        groupedValues.computeIfAbsent(name, (a)->new ArrayList<Double>()).add(value);
    }
    public void process(String name, Double value){
        List<Double> values = groupedValues.get(name);
        if(values == null){
            values = new ArrayList<>();
            groupedValues.put(name, values);
        }
        values.add(value);
    }
}