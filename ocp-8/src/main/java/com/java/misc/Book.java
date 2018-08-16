/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * static String getId(){
 * return "AIN8888";
 * }
 * You cannot override a static method with a non-static method and vice-versa. You can, however, redeclare a static method of a super interface as a default method in the sub interface.
 * String getId();
 * An interface can redeclare a default method and also make it abstract.
 * default String getId(){
 * return "AIN8888";
 * };
 * An interface can redeclare a default method and provide a different implementation.
 * abstract static String getName();
 * 1. static methods can never be abstract (neither in an interface nor in a class).
 * 2. An interface can have a static method but the method must have a body.
 * static String getAuthor();
 * An interface can have a static method but the method must have a body.
 * default String getAuthor();
 * A default method must have a body.
 */

enum Switch {
    ON, OFF
}

enum Coffee
{
    ESPRESSO("Very Strong"), MOCHA, LATTE; //2
    public String strength; //3

    Coffee(String strength) {
        this.strength = strength; //5
    }
    Coffee() { }
}

/**
 * @author Dhiraj
 * @date 09/08/18
 */
public interface Book {
    public default String getId() {
        return "ISBN123456";
    }
    /*static String getId(){
        return "AIN8888";
    }*/
}

interface Encyclopedia extends Book {
    //INSERT CODE HERE

    /*static String getId(){
        return "AIN8888";
    }*/
    //String getId();

    default String getId() {
        return "AIN8888";
    }
}

class TestClass7 {
    public static void main(String[] args) {
        Switch s = Switch.OFF;
        switch (s) {
            //case Switch.OFF:
            case OFF:
                System.out.println();
        }
    }
}