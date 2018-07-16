/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * @author Dhiraj
 * @date 10/07/18
 */
public class TestClass6 {
    public static void main(String[] args) {
        Consumer consumer=System.out::println;
        consumer.accept(Locale.getDefault());
        consumer.accept(
                new Locale.Builder()
                .setLanguage("hi")
                .setRegion("IN")
                .build()
        );
    }
}
