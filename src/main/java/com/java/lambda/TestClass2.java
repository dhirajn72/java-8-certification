/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

/**
 * @author Dhiraj
 * @date 10/06/18
 */

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House  {
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {

}

public class TestClass2 {
    public static void main(String[] args) {
        House ci = new MyHouse();
        System.out.println(ci.getAddress());
    }
}