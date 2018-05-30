/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 25/05/18
 */
public class AutoBoxingTest {
    static Integer x;

    public static void main(String[] args) {
        doStuff(x);
        // While unboxing NPE will be thrown,
        // because to call doStuff in is needed,
        // to get the int unboxing has to be done,
        // and because x is null, while unboxing,
        // NPE will be thrown !!!!!

    }

    static void doStuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z);

    }

}
