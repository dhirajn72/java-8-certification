/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 04/09/18
 */
public class TestClass25
{
    public class A
    {
    }
    public static class B
    {
    }
    public void useClasses()
    {
        //1
        new TestClass25().new A();
        new A();
        new B();
        new TestClass25.B();
        new TestClass25.A();
    }
}