/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

/**
 * @author Dhiraj
 * @date 16/06/18
 */

interface MyInterface {
    default int doStuff() {
        return 42; }
}
public class IFaceTest implements MyInterface {
    public static void main(String[] args) {
        new IFaceTest().go();
    }
    void go() {
        // INSERT CODE HERE
        // System.out.println("class: " + doStuff());
        // System.out.println("iface: " + super.doStuff());
        // System.out.println("iface: " + MyInterface.super.doStuff());
        // System.out.println("iface: " + MyInterface.doStuff());
        // System.out.println("iface: " + super.MyInterface.doStuff());
    }
    public int doStuff() {
        return 43;
    } }