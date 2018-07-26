/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 22/07/18
 */
public class TestClass6 {
    public static void main(String[] args) {

        List<String> strings= new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        List<String> strings1= new ArrayList<>(strings);
        for (String s:strings1){
            System.out.println(s);
            strings.add(s);
        }

        for (String s:strings){
            System.out.println(s);
            //strings.add(s);
        }

        int[] arr1={1,2,3,4,5};
        List integers= Arrays.asList(arr1);
        Object[] arr2= integers.toArray();
        System.out.println(arr1);
        if (arr2 instanceof Integer[]){
            Integer[] integers1=(Integer[]) arr2;
            System.out.println("yes::"+integers1);
        }
        System.out.println(arr2);

    }
}
