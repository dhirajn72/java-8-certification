/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class TestClass3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3, 1, 0};
        System.out.println(a[(a = b)[3]]);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}



