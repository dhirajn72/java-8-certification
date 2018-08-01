/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 29/07/18
 */
public class TestClass12 {
    public static void main(String[] args) {

        Locale hi= new Locale("hi","IN");
        Locale en= new Locale("en","US");
        Locale fr= new Locale("fr","FR");
        printLocale(hi);
        System.out.println();
        printLocale(en);
        System.out.println();
        printLocale(fr);
    }
    static void printLocale(Locale locale){
        ResourceBundle rb= ResourceBundle.getBundle("zoo",locale);
        Set<String> strings=rb.keySet();
        //strings.stream().map(x->x+"="+ rb.getString(x)).forEach(System.out::println);
        System.out.println("****");
        strings.stream().map(x->x+"="+ rb.getObject(x)).forEach(System.out::println);


    }
}
