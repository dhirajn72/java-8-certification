/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 04/09/18
 */


class A {
}

public class TestClass28 {
    public static void main(String args[]) {
        new TestClass28().new A() {
            public void m() { }
        };
        //B b=new B();
    }
    public class A {
        public void m() {
        }
    }
    class B extends A {
    }
}