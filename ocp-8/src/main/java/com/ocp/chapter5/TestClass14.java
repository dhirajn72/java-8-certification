/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Dhiraj
 * @date 30/07/18
 */
public class TestClass14 {
    public static void main(String[] args) {
        Locale locale=new Locale("hi","IN");
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(60));
    }
}
