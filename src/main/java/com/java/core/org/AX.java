/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core.org;

import com.java.core.Parent1;

/**
 * @author Dhiraj
 * @date 12/06/18
 */

class AX {
    static int[] x = new int[0];

    static {
        x[0] = 10;
    }

    public static void main(String[] args) {
        AX ax = new AX();
    }



}






interface Parent{
    public default void m1(){
        System.out.println("m1");
    }
}

interface Child extends Parent{
    /*public default void m1(){
        System.out.println("m1");
    }*/
    //public  void m1();
}


class Test implements Child,Parent{

    /*@Override
    public void m1() {

    }*/
}
