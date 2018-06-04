/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;

/**
 * @author Dhiraj
 * @date 03/06/18
 */
public class TestClass3 {

    public static void main(String args[]) {
        TestClass tc = new TestClass();
        //tc.method(null);
    }

    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(String s) {
        System.out.println("String Version");
    }

    public void method(StringBuffer s) {
        System.out.println("StringBuffer Version");
    }
}