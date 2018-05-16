/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 16/05/18
 */
public class Singleton implements Cloneable {

    private static final Singleton singleton=new Singleton();

    private Singleton() {
    }

    public static Singleton getInstace(){
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
