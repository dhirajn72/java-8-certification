/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 12/05/18
 */


class Dog1{
    public void bark() {
        System.out.println("woof ");
    }
}
class Hounds extends Dog1{
    public void sniff(){
        System.out.println("sniff");
    }
    public void bark() {
        System.out.println("howl ");
    }
}

public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hounds().bark();
        ((Dog1)new Hounds()).bark();
       // ((Dog1)new Hounds()).sniff();

    }

}


