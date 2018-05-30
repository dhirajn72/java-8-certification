/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

/**
 * @author Dhiraj
 * @date 27/05/18
 */


public class TestClass1 {
    public static void main(String args[]) {
        int i = 0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
    }
}
