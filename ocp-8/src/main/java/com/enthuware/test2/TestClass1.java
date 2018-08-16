/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test2;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Dhiraj
 * @date 15/08/18
 */
public class TestClass1
{
    public static void main(String[] args)  throws Exception
    {
        FileWriter fw = new FileWriter("text.txt");
        fw.write("hello"); //1

        fw.close();
    }
}