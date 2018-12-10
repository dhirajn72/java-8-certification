/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

import java.util.Objects;

/**
 * @author Dhiraj
 * @date 28/11/18
 */
public class TestClass20 {
    public static void main(String[] args) {
        Object ob=null;
        synchronized (ob){
            System.out.println(ob);
        }
    }
}
