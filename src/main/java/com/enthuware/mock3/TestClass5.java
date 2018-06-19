/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock3;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 14/06/18
 */

public class TestClass5 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb.length()+" "+sb);
        int[] arr = new int[9];
        arr[0]++;
        //Object[] ar=arr;
        for (int x:arr){
            System.out.println(x);
        }
    }
}