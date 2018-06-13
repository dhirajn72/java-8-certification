/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

/**
 * @author Dhiraj
 * @date 10/06/18
 */


class TestClass3 {
    int i;

    public TestClass3(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        TestClass3 t1 = new TestClass3(0);
        TestClass3 t2 = new TestClass3(2);
        System.out.println(t2);
        System.out.println("" + t1);
    }

    public String toString() {
        if (i == 0) return null;
        else return "" + i;
    }
}