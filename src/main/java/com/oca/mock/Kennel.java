/*
 * All Rights Reserved @Dhiraj
 */

package com.oca.mock;

/**
 * @author Dhiraj
 * @date 26/05/18
 */
public class Kennel {
    public static void main(String[] args) {
        Beagle b1=new Beagle();
        Dog dog1= new Dog();
        Dog dog2=dog1;
        //Beagle b2=(Beagle)dog1; // Will compile but CCE at runtime.

        int i=3;
        int j=7;
        if (i>7)
            System.out.println("1");
        else if (i+4>7)
            System.out.println("2");
        else if (j>5)
            System.out.println("3");
        //else
          //  System.out.println("4");

    }
}

class Dog{}
class Beagle extends Dog{}