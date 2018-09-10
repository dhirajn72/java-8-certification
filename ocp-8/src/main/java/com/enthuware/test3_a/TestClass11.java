/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.Optional;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass11 {
    public static void main(String[] args) throws Exception {
        Optional<Double> doubleOptional= Optional.ofNullable(getPrice("test"));
        System.out.println(doubleOptional);
        System.out.println(doubleOptional.orElse(null));
        System.out.println(doubleOptional.orElseGet(()->89.00));
        System.out.println(doubleOptional.orElseThrow(()->new Exception("Optional is empty !!!!!")));
    }
    private static Double getPrice(String s) {
        //return 99.00;
        return null;
    }
}
