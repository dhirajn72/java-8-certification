/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 02/09/18
 */


public class TestClass12 extends Thread
{
    static int x, y;
    public synchronized void run(){  for(;;){ x++; y++; System.out.println(x+" "+y);} }
    public static void main(String[] args)
    {
        new TestClass12().start();
        new TestClass12().start();
    }
}