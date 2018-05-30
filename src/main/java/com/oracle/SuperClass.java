/*
 * All Rights Reserved @Dhiraj
 */

package com.oracle;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class SuperClass {
    int x;
    protected int y;
    public int z;
}


class SubInTheSamePackage extends SuperClass{
    public static void main(String[] args) {
        new SubInTheSamePackage().show();
    }

    public void show(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}