/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Dhiraj
 * @date 04/09/18
 */
public class TestClass27 {
    public static void main(String[] args) {
        Locale l= new Locale("hi","IN");
        ResourceBundle rb = ResourceBundle.getBundle("com.ocp.chapter5.zoo",l);
        System.out.println(rb.getObject("hi"));
        System.out.println(rb.getString("hi"));
        /*String[] keyArr=rb.getStringArray("hi");
        for(String s:keyArr) System.out.println(s);*/
        byte b=-128;
    }
}
class Throw {
    public void m1() throws Throwable{

    }
}