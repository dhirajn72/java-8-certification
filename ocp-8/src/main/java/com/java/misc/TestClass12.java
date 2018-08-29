/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Dhiraj
 * @date 20/08/18
 */
public class TestClass12 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().compareTo(o1.toLowerCase());
        //return o1.toLowerCase().compareTo(o2.toLowerCase());
    }

    public static void main(String[] args) {
        String[] values={"123","Abb","aab"};
        Arrays.sort(values,new TestClass12());
        for (String s:values)
            System.out.print(s+" ");
        //System.out.println((int)'a');
    }
}
