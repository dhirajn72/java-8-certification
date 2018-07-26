/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/07/18
 */
public class TestClass14 {
    public static void main(String[] args) {
        List<? super IOException> ioExceptions= new ArrayList<Exception>();
        //ioExceptions.add(new Exception());
        ioExceptions.add(new IOException());
        ioExceptions.add(new FileNotFoundException());
        List<String> list=new ArrayList<String>();

        //method1(list);
        System.out.println("***");
        List<Emp> e= new ArrayList<>();
        e.add(new Emp(65,"x"));
        e.add(new Emp(3,"d"));
        e.add(new Emp(35,"y"));
        e.add(new Emp(5,"h"));
        Collections.sort(e);
        /*for (Emp e1:e){
            System.out.println(e1);
        }*/

        /**
         * Below both methods are same
         */
        Collections.sort(e,(o1,o2)->{ return o1.getName().compareTo(o2.getName()); });
        Collections.sort(e, Comparator.comparing(Emp::getName));

        for (Emp e1:e){
            System.out.println(e1);
        }
    }

    public static <T> T method1(List<? extends T> list){
        return list.get(0);
    }
}

class Emp implements Comparable{
    private int id;
    private String name;

    public Emp(int id, String name) {
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Emp){
            Emp e=(Emp)o;
            return this.id-e.id;
        }
        else throw new IllegalArgumentException("Can't sort !!");
    }
}