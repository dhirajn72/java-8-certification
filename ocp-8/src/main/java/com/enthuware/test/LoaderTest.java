/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import com.sun.javafx.util.Logging;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 31/08/18
 */
public class LoaderTest extends ClassLoader {
    static int count;
    public static void main(String[] args) {
        ClassLoader loader= ClassLoader.getSystemClassLoader();
        System.out.println(String.class.getClassLoader());
        System.out.println(LoaderTest.class.getClassLoader());
        System.out.println(Arrays.class.getClassLoader());
        System.out.println(Logging.class.getClassLoader());
        //String.m1();

        System.out.println(count++);
    }
}

/*class String{
    static void m1(){
        System.out.println("m1");
    }
}*/
