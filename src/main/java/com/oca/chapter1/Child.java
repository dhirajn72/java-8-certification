/*
 * All Rights Reserved @Dhiraj
 */

package com.oca.chapter1;

import com.java.core.Parent;

import java.util.Objects;

/**
 * @author Dhiraj
 * @date 11/05/18
 */
public class Child extends Parent {
    int count=88;


    public static void main(String[] args) {
        System.out.println(new Child());
        new Child().show();
        int[] ints=new int[]{};
        System.out.println(ints.length);
        System.out.println("******");

        Object ob= new Parent();
        Child child= (Child) ob;
        child.show();


    }

    public void show(){
       // int count=99;
        System.out.println(x);
        System.out.println(count);
        //Parent p= new Child();
        //System.out.println(p.x); Illegal Not Allowed! Child can access using inheritance
    }
}
