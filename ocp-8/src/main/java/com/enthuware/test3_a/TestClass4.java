/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class TestClass4 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);

        System.out.println(ls.stream().reduce(0,(a,b)->a+b));
        System.out.println(ls.stream().mapToInt(x->x).sum());

    }
}

