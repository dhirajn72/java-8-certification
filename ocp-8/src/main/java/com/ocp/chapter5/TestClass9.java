/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 10/07/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        Consumer consumer=System.out::println;

        //Locale.setDefault(new Locale("en","US"));
        consumer.accept(Locale.getDefault());
        consumer.accept(NumberFormat.getCurrencyInstance().format(123));
        consumer.accept(NumberFormat.getPercentInstance().format(12));

    }
}
