/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 18/09/18
 */
public class TestClass40 {
    public static void main(String[] args) {

        Integer integer=Arrays.asList(1,2,3,4).parallelStream().findAny().get();
        System.out.println(integer);
        String s=Arrays.asList("1","2","3","4").parallelStream().findAny().get();
        System.out.println(s);

        System.out.println(Arrays.asList("apple","ball","cat","dog").parallelStream().reduce(0,(c1,c2)-> c1+c2.length(),(c1,c2)->c1+c2));;

    }
}
