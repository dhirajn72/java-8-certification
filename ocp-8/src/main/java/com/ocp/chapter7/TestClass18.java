/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

/**
 * @author Dhiraj
 * @date 01/08/18
 */
public class TestClass18 {
    public static void main(String[] args) {
        try {
            doIt();
        }catch (Error e){
            System.out.println("caught error");
        }
    }
    static void doIt(){
        System.out.println("Do it !!");
        doIt();
    }
}
