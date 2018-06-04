/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;

/**
 * @author Dhiraj
 * @date 03/06/18
 */



public class TestClass2{
    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(java.io.FileNotFoundException s){
        System.out.println("java.io.FileNotFoundException Version");
    }
    public void method(java.io.IOException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
        TestClass2 tc = new TestClass2();
        tc.method(null);
    }
}
