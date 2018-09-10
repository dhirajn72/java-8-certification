/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import javax.management.ReflectionException;
import java.io.Serializable;

/**
 * @author Dhiraj
 * @date 30/08/18
 */
public class Singleton implements Serializable,Cloneable {
    private static Singleton INSTANCE=null;

    private Singleton(){
        if(Singleton.INSTANCE!=null){
            throw new RuntimeException("Object exists !!");
        }
    }
    public static Singleton getInstance(){
        if (INSTANCE==null){
            synchronized (Singleton.class){
                if (INSTANCE==null){
                    INSTANCE=new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    private Object readResolve(){
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return INSTANCE;
        //return super.clone();
    }
}
