/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter2;

/**
 * @author Dhiraj
 * @date 03/07/18
 */
public class TestClass1  implements ExtendTestFuncInterface{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}


@FunctionalInterface
interface TestFuncInterface{
    void m1();
}
interface ExtendTestFuncInterface extends TestFuncInterface{
    void m1();
    void m2();

}
