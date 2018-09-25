/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.util.Locale;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass18 {
    public static void main(String[] args) {
        System.out.println(Locale.CANADA_FRENCH);
        System.out.println(Locale.getDefault());
        Locale locale=new Locale("fr","CA");
        Locale.setDefault(locale);
        System.out.println(Locale.getDefault());
        System.out.println(Locale.getDefault());
    }
}
