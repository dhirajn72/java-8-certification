/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock3;

/**
 * @author Dhiraj
 * @date 04/06/18
 */


class A {
    public int getCode() {
        return 2;
    }
}

class AA extends A {
    // public long getCode(){ return 3;}
}

public class TestClass1 {

    public static void main(String[] args) throws Exception {
        A a = new A();
        A aa = new AA();
        System.out.println(a.getCode() + " " + aa.getCode());

        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;
        System.out.println(i1==i2);
        System.out.println(i1==i3);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
    }

    public int getCode() {
        return 1;
    }
}