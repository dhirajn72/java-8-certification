/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 14/05/18
 */
public class Test2 {

    final String name;

    public Test2(String name) {
        this.name = name;
        System.out.println("cons called!");
        String res=getName();
        System.out.println(res);
    }

    private String getName() {
        System.out.println("getter called!");
        return name;
    }

    public static void main(String[] args) {
        new Test2("dhiraj");
    }

}

