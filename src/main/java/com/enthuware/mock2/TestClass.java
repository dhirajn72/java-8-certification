/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;

/**
 * @author Dhiraj
 * @date 03/06/18
 */
class MyException extends Exception {}
public class TestClass{
    public static void main(String[] args){
        TestClass tc = new TestClass();
        try{
            tc.m1();
        }
        catch (MyException e){
           // tc.m1();
        }
        finally{
            tc.m2();
        }
    }
    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }
}
