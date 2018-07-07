/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 05/07/18
 */
public class TestClass1 {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(new Integer(3));
        integers.add(new Integer(5));
        System.out.println(integers);
        integers.remove(1);
        //integers.remove(new Integer(1));
        System.out.println(integers);

        System.out.println("********");
        String[] strings= {"gerbil","mouse"};
        List<String> list= Arrays.asList(strings);
        //list.add("test");
        System.out.println(list.get(1));


    }
}
