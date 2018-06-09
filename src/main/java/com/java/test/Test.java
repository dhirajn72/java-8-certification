/*
 * All Rights Reserved @Dhiraj
 */

package com.java.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dhiraj
 * @date 07/06/18
 */
public class Test {
    public static void main(String[] args) {
        int[] arr=null;
        System.out.println(arr instanceof Object); // returns true is arr initialised,  {}
        int x=123_456_789_2;

        int a=new Integer(12);
        float f=new Float(23);
        float f1=34;
        Double d=23D;
        System.out.println(a+" "+f+" "+d+" "+f1);

        Map<String,String> stringMap= new HashMap<>();
        stringMap.put("k1","v1");
        stringMap.put("k2","v2");
        stringMap.put("k3","v3");
        System.out.println(stringMap.get(new String ("k3")));



    }
}
