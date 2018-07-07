/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 03/07/18
 */
public class TestClass3 extends TestClass3B implements TestClass3A{

    public static void main(String[] args) {
        new TestClass3().doIt();

        /*List<TestClass3B> testClass3BS= new ArrayList<>();
        testClass3BS.add(new TestClass3());*/


    }

    public void doIt(){
        this.m1();

    }

}

interface TestClass3A{
    default void m1(){
        System.out.println("m1");
    }
}
class TestClass3B{
    /*void m1(){
        System.out.println();
    }*/
}