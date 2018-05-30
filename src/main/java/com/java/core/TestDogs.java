/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Dhiraj
 * @date 25/05/18
 */
public class TestDogs {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("boi", 30, 6));
        dogs.add(new Dog("tyri", 40, 12));
        dogs.add(new Dog("charis", 120, 7));
        dogs.add(new Dog("aiko", 50, 10));
        dogs.add(new Dog("clover", 35, 12));
        dogs.add(new Dog("mia", 15, 4));
        dogs.add(new Dog("zooey", 45, 8));
        // run a few "queries"
        System.out.println("all dogs  " + dogs);
        System.out.println("min age 7 " + minAge(dogs, 7).toString());
        System.out.println("max wght. " + maxWeight(dogs, 40).toString());
        System.out.println("**********");

        System.out.println("min age 7 " + dogQuerier(dogs,d ->d.getAge()>=7 ));
        System.out.println("max wght. " + dogQuerier(dogs,d -> d.getWeight()<=40));

    }

    // declare "query" methods
    static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor) {
        ArrayList<Dog> result1 = new ArrayList<>(); // do a minimum age query
        for (Dog d : dogList)
            if (d.getAge() >= testFor)                 // the key moment!
                result1.add(d);
        return result1;
    }

    static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor) {
        ArrayList<Dog> result1 = new ArrayList<>(); // do a max weight query
        for (Dog d : dogList)
            if (d.getWeight() <= testFor)              // the key moment!
                result1.add(d);
        return result1;
    }
    static ArrayList<Dog> dogQuerier(ArrayList<Dog> dogList, Predicate<Dog> exp) {
        ArrayList<Dog> result1 = new ArrayList<>(); // do a max weight query
        for (Dog d : dogList)
            if (exp.test(d))              // the key moment!
                result1.add(d);
        return result1;
    }




}
