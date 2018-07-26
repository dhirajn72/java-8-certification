/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

import java.util.Date;

/**
 * @author Dhiraj
 * @date 23/07/18
 */
public class TestClass8 {
    public static void main(String[] args) {
        //AnimalBuilder.ImmutableAnimal animalBuilder= new AnimalBuilder().setId(1)
        ImmutableAnimal animalBuilder = new AnimalBuilder()
                .setId(1)
                .setName(new StringBuilder("xz"))
                .setWeight(78.00)
                .setDob(new Date())
                .build();
        System.out.println(animalBuilder);
    }
}
