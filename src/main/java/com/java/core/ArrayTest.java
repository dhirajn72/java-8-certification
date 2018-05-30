/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dhiraj
 * @date 15/05/18
 */
public class ArrayTest {
    public static void main(String[] args) {

        int [][] arr= new int[4][2];
        System.out.println(Arrays.deepToString(arr));

        int [][][][]arr1= new int[2][2][][];
        System.out.println(Arrays.deepToString(arr1));

        int[] arrr2= new int[6];
        for (int i=0;i<arrr2.length;i++){
            System.out.println(arrr2[i]);
        }
        int[][] arr3={{3,4,5,6,7,8,},{9,8,7,5,},{4,4,4,4,4,},{3,3,3,},{1,2,1,2,}};
        //int[][] arr3=new int[5][2];
        System.out.println(Arrays.deepToString(arr3)+" "+arr3[4].length);


        Integer i1=128;
        Integer i2=128;
        if (i1!=i2)
            System.out.println("Different objects!!");
        if (i1==i2)
            System.out.println("Same objects!!");

        List<String> string= new ArrayList<>();
        string.add("test");
        string.add("singh");
        string.add("dhiraj");
        string.add("singh");
        string.add("kumar");

    }
}
