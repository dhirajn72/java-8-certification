/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 02/09/18
 */

public class TestClass15 extends Thread
{
    private static int threadcounter = 0;
    public void run()
    {
        threadcounter++;
        System.out.println(threadcounter);
    }
    public static void main(String[] args) throws Exception
    {
        for(int i=0; i<10; i++)
        {
            synchronized(TestClass15.class)
            {
                new TestClass15().start();
            }
        }
    }
}
