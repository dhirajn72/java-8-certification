/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 11/05/18
 */
public class Parent {
    protected int x=90;

    public void show(){
        System.out.println("parent-show()");
        // int count=99;
        System.out.println(x);
        System.out.println();
        //Parent p= new Child();
        //System.out.println(p.x); Illegal Not Allowed! Child can access using inheritance
    }
}
