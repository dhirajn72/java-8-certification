/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 24/05/18
 */
public class Gotcha {
    public static void main(String[] args) {
        try {
            new Gotcha().go();
        }//catch (Exception e){
            catch (Error e){
            System.out.println("ouch");
        }
        System.out.println("Completes normally!");
    }

    void go(){
        go();
    }
}
