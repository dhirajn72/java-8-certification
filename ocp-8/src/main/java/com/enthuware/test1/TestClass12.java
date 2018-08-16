/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

/**
 * @author Dhiraj
 * @date 14/08/18
 */

public class TestClass12 {
    public static boolean isGoodnumber(int n) {
        assert n > 5;
        return true;
    }

    public static void main(String[] args) {
        int i = Integer.parseInt(args[1]);
        int j = Integer.parseInt(args[2]);
        do {
            i--;
            if (i < 5) break;
        } while (isGoodnumber(j--));
        System.out.println(i);

    }
}
