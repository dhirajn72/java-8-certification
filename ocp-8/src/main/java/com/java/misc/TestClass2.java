/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

/**
 * @author Dhiraj
 * @date 20/07/18
 */
public class TestClass2 {
    public static void main(String[] args) {
        DoublePredicate intPredicate= (x)->{
            System.out.println(x);
            return false;
        };
        System.out.println(intPredicate.test(4));
        Runnable runnable=()-> {};
        new Thread(runnable);

        System.out.println(Long.valueOf(null));


    }
}
