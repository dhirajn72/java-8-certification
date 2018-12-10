/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import com.ocp.chapter6.Singleton;

/**
 * @author Dhiraj
 * @date 28/11/18
 */
public class TestClass19 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        System.out.println(instance);
        try {
            Singleton2 instance2 = (Singleton2) instance.clone();
            System.out.println(instance2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
class Singleton2 implements Cloneable {
    private static Singleton2 instance = null;
    private Singleton2() {
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static Singleton2 getInstance() {

        if (instance==null){
            synchronized (Singleton2.class){
                if (instance==null){
                    instance=new Singleton2();
                }
            }
        }
        return instance;
    }
}