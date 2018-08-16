/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

import java.io.FileNotFoundException;

/**
 * @author Dhiraj
 * @date 10/08/18
 */
public class TestClass3 implements II1,II2{
    public void m1()throws FileNotFoundException{}
}
interface II1
{
    void m1() throws java.io.IOException;
}
interface II2
{
    void m1() throws java.io.FileNotFoundException;
}