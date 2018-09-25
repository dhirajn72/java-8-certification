/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass20 {
    public static void main(String[] args) {

        Locale locale = new Locale("en", "US");
        //Locale.setDefault(locale);
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.getCurrency());
        System.out.println(NumberFormat.getCurrencyInstance().format(34.00));
        System.out.println(NumberFormat.getIntegerInstance().format(34.00));
    }
}
