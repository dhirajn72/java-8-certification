/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 25/08/18
 */
public class TestClass9 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b)); //1
        System.out.println(ls.stream().max((a,b)->Integer.max(a,b)).get()); //2
        System.out.println(ls.stream().max((a,b)->Integer.compare(a,b)).get()); //3
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b)); //4
    }
}
