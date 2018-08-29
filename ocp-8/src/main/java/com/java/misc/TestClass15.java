/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Dhiraj
 * @date 22/08/18
 */
public class TestClass15 {
    public static void main(String[] args) {
        QuadFunction<Integer,Integer,Integer,Integer,MyProcessor> myProcessorQuadFunction=MyProcessor::new;
        MyProcessor myProcessor= myProcessorQuadFunction.apply(1,2,3,4);
        myProcessor.process();
    }
}

interface QuadFunction<A,B,C,D,E>{
    E apply(A a,B b,C c,D d);
}
class MyProcessor{
    int value;
    int size;
    int name;
    int type;
    public MyProcessor(){
        System.out.println("DC"); value = 10; }

    public MyProcessor(int value, int size, int name, int type) {
        this.value = value;
        this.size = size;
        this.name = name;
        this.type = type;
    }
    public void process(){
        System.out.println("Processing "+value+" "+size+" "+name+" "+type);
    }
}