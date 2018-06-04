/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock3;

/**
 * @author Dhiraj
 * @date 04/06/18
 */

public class TryTest {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(100);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }

    public float parseFloat(String s) {
        float f = 0.0f;      // 1
        try {
            f = Float.valueOf(s).floatValue();    // 2
            return f;      // 3
        } catch (NumberFormatException nfe) {
            f = Float.NaN;    // 4
            return f;     // 5
        } finally {
            return f;     // 6
        }
        //return f;    // 7
    }
}
