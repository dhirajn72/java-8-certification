/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass10 {
    public static void main(String[] args) {
        Squirrel s1= new Squirrel(1,"xyz");
        Squirrel s2= new Squirrel(5,"abd");
        Squirrel s3= new Squirrel(3,"bcd");

        List<Squirrel> squirrels= new ArrayList<>();
        squirrels.add(s1);
        squirrels.add(s2);
        squirrels.add(s3);
        System.out.println("before sorting::");
        squirrels.stream().forEach(System.out::println);
        Collections.sort(squirrels,new MultifieldComparator());
        System.out.println("After sorting::");
        squirrels.stream().forEach(System.out::println);
    }
}

class MultifieldComparator implements Comparator<Squirrel>{
    @Override
    public int compare(Squirrel o1, Squirrel o2) {
        /*int result=o1.getSpecies().compareTo(o2.getSpecies());
        if (result!=0)return result;
        return o1.getWeight()-o2.getWeight();*/

        //Comparator<Squirrel> comparator=Comparator.comparing(x->x.getWeight());
        Comparator<Squirrel> comparator=Comparator.comparing(x->x.getSpecies());
        comparator=comparator.thenComparingInt(x->x.getWeight());
        return comparator.compare(o1,o2);

    }
}

class Squirrel{
    private int weight;
    private String species;

    public Squirrel(int weight,String species){
        if (species==null)throw new IllegalArgumentException();
        this.species=species;
        this.weight=weight;
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
