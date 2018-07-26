/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj
 * @date 07/07/18
 */
public class TestClass4 {
    public static void main(String[] args) {
        List<Squirrel> squirrels= new ArrayList<>();
        Squirrel s1=new Squirrel("C");
        s1.setWeight(2);
        Squirrel s2=new Squirrel("TestClass1");
        s2.setWeight(5);
        Squirrel s3=new Squirrel("B");
        s3.setWeight(1);
        squirrels.add(s1);
        squirrels.add(s2);
        squirrels.add(s3);

        System.out.println(squirrels);
        Collections.sort(squirrels,new ChainingComparator());
        System.out.println(squirrels);
    }
}

class Squirrel{
    private int weight;
    private String species;

    public Squirrel(String species){
        if (species==null)throw new IllegalArgumentException();
        this.species=species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

class ChainingComparator implements Comparator<Squirrel>{
    @Override
    public int compare(Squirrel s1, Squirrel s2) {
        Comparator<Squirrel> c= Comparator.comparing(s -> s.getSpecies());
        //Comparator<Squirrel> c= Comparator.comparing(s -> s.getWeight());
        c=c.thenComparingInt(s->s.getWeight());
        return c.compare(s1,s2);
    }
}
