/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

/**
 * @author Dhiraj
 * @date 09/08/18
 */

public class TestOuter
{
    public void myOuterMethod()
    {
        // 1
        this.new TestInner(); //valid WTF !
    }
    public class TestInner { }
    public static void main(String[] args)
    {
        TestOuter to = new TestOuter();
        // 2
    }
}


interface I1{

}

enum TestInterface implements I1{

}