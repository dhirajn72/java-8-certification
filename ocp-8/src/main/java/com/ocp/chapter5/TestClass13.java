/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass13 {

    public static void main(String[] args) {
        ResourceBundle bundle= ResourceBundle.getBundle("com.ocp.chapter5.Zoo_en_US",Locale.US);
        System.out.println(bundle.getObject("hi"));

    }

}



