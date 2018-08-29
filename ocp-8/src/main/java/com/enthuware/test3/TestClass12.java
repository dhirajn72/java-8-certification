/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Inter {
    int m1();
}

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass12 {
    public static void main(String[] args) {
        doIt(() -> {
            System.out.println("doIt implementation");
            int i = 0;
            int j = 99;
            System.out.println(i + j);
            return i + j;
        });

        List<? extends Bird> birds= new ArrayList<>();
        //birds.add(new Sparrow());
        List<Sparrow> sparrows= new ArrayList<>();
        birds=sparrows;
        List<Bird> birds1= new ArrayList<>();
        birds=birds1;
    }

    public static void doIt(Inter i) {
        i.m1();
    }

    static class Sparrow extends Bird {
    }

    static class Bird {
    }

}

