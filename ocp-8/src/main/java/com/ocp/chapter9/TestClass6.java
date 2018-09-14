/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 13/09/18
 */
public class TestClass6 {
    public static void main(String[] args) {
        //HashSet<Number> numbers= new HashSet<Integer>();
        HashSet<? super ClassCastException> numbers= new HashSet<Exception>();
        Map<String,? extends Number> stringMap=new HashMap<String, Integer>();
    }
}