/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dhiraj
 * @date 24/07/18
 */
public class TestClass8 {
    public static void main(String[] args) {
        int[] arr={5,2,9,8,4};
        Arrays.sort(arr);   //[2,4,5,8,9]
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,3));




    }
}
