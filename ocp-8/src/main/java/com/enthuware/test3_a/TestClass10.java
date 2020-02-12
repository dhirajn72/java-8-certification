/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.ArrayList;
import java.util.List;
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

        System.out.println("*****");
        Optional<List<String>> listOptional=Optional.ofNullable(getPriceList(""));
        //listOptional.orElseThrow(IllegalArgumentException::new);
        List<String> res= listOptional.orElse(new ArrayList<>());
        System.out.println(res);



    }

    private static Double getPrice(String s) {
        //return 99.00;
        return null;
    }
    private static List<String> getPriceList(String s) {
        //return 99.00;
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("apple");
        list.add("apple");
        return list;
    }
}
