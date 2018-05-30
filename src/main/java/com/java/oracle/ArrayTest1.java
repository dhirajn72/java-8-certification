/*
 * All Rights Reserved @Dhiraj
 */

package com.java.oracle;

/**
 * @author Dhiraj
 * @date 26/05/18
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[][] a = {{1,2}, {3,4}};
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
        int[] b2 = (int[]) o1; // Runtime Exception here, 2-D Arraya can't be assigned to 1-D ref
        System.out.println(b[1]);
    }
}
