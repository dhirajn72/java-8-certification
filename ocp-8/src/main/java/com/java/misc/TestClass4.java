/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.Map;

/**
 * @author Dhiraj
 * @date 01/08/18
 */
public class TestClass4 {
    public static void main(String[] args) {

        Integer[] integers1= new Integer[3];
        Integer[] integers2= {2,3,4};

        Map<String,Integer> [] maps= new Map[1];
        for (Map<String,Integer> map:maps){
            System.out.println(map.keySet());
        }
    }
}
