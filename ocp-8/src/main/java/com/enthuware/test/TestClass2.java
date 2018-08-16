/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

/**
 * @author Dhiraj
 * @date 09/08/18
 */
public class TestClass2 {
    public static void main(String args[]) {
        Outer out = new Outer();
        System.out.println(out.getInner().getOi());
    }
}

class Outer {
    private int oi = 20;
    Inner getInner() {
        return new Inner();
    }

    class Inner {
        int getOi() {
            return oi;
        }
    }
}
