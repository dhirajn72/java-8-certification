/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 24/07/18
 */
public class TestClass13 {
    public static void main(String[] args) {
        List<? extends Bird> birds= new ArrayList<>();
        List<Bird> birds1= new ArrayList<>();
        birds1.add(new Sparrow());
        birds1.add(new Bird());

        List<Sparrow> sparrows= new ArrayList<Sparrow>();
        sparrows.add(new Sparrow());
        sparrows.add(new Sparrow());
        sparrows.add(new Sparrow());



        //birds1=sparrows;
        //birds.add(new Bird());       //Does not compile
        // birds.add(new Sparrow());   //Does not compile

        birds=new ArrayList<Sparrow>();

        List<Object> objects= new ArrayList<Object>(sparrows);
        //objects=sparrows;

        List<Bird> birds2=new ArrayList<Bird>(sparrows);
        for (Bird b:birds2)
            System.out.println(b);
        System.out.println("******");

        List<? extends Bird> birds3=new ArrayList<>(sparrows);
        for (Bird b:birds3){
            if (b instanceof Sparrow)
                System.out.println("true::"+b);
        }

        System.out.println("******");
        List<String> strings= new ArrayList<String>();
        strings.add("test");
        List<Object> objects1=new ArrayList<Object>();
        //objects1.add(strings);
        addSound(strings);
        addSound(objects1);
        for (Object ob:objects1)
            System.out.println(ob);
        //List<Integer> integers=new ArrayList<>();
        // List<Number> numbers=new ArrayList<>(integers);
         List<Number> numbers=new ArrayList<>();
       // List<Integer> integers=new ArrayList<>(numbers);

    }
    static void addSound(List<? super String> objects){
        objects.add("quack");
    }

    static class Sparrow extends Bird{}
    static class Bird{}
}


