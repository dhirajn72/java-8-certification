/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core.org;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class TestAClassInterface extends AbstractTest implements Inter1 {

    public static void main(String[] args) {
        TestAClassInterface testAClassInterface= new TestAClassInterface();
        testAClassInterface.show();
    }

    public void show(){
        this.m1();
        super.m1();
    }

    @Override
    public void m1() {
        System.out.println("overriden from Interface");

    }
}

interface Inter1{
    void m1();
}

abstract  class AbstractTest{
    public void m1(){
        System.out.println("AC-m1()");
    }
}
