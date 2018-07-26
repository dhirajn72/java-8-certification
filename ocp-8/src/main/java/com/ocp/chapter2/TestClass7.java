/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * @author Dhiraj
 * @date 22/07/18
 */
public class TestClass7 {
    public static void main(String[] args) {
        ImmutableAnimal immutableAnimal= new ImmutableAnimal(99,new StringBuilder("dog"), Calendar.getInstance().getTime(),800);
        System.out.println(immutableAnimal);
        System.out.println(immutableAnimal.getObject());
        System.out.println(immutableAnimal.getObject()==immutableAnimal);

        StringBuilder name= immutableAnimal.getName();
        ImmutableAnimal immutableAnimal1= new ImmutableAnimal(immutableAnimal.getId(),name,immutableAnimal.getDob(),900);

        System.out.println("*****");
        System.out.println(immutableAnimal);
        System.out.println(immutableAnimal1);

    }
}
