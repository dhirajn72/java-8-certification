/*
 * All Rights Reserved @Dhiraj
 */

package com.oca.chapter1;

import com.java.core.Inter1;
import com.java.core.Inter2;

/**
 * @author Dhiraj
 * @date 12/05/18
 */
public class Test3 implements Inter1,Inter2 {
    @Override
    public void m1() {
        Inter1.super.m1();
        Inter2.super.m1();
    }

    public static void main(String[] args) {
        new Test3().m1();
    }


}
