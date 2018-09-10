/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.Optional;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass10 {
    public static void main(String[] args) {
        Optional<Double> price = Optional.ofNullable(getPrice("1111"));
        Double x = price.orElse(getPrice("2222"));
        System.out.println(price);
        System.out.println(x);

        Optional<Double> price1 = Optional.ofNullable(getPrice("1111"));
        Double y = price1.orElseGet(()->getPrice("333"));
        System.out.println(price1);
        System.out.println(y);
    }

    private static Double getPrice(String s) {
        //return 99.00;
        return null;
    }
}
