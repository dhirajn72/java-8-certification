/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

/**
 * @author Dhiraj
 * @date 05/07/18
 */
public class TestClass2 {
}


interface A1{
    default void m1(){
        System.out.println("TestClass1's-m1()");
    }
}

interface B1{

    default void m1(){
        System.out.println("TestClass1's-m1()");
    }
    void m2();
}

/*
interface C1 extends A1,B1{

}*/
