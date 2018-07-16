/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Dhiraj
 * @date 11/07/18
 */
public class TestClass1 {
    public static void main(String[] args) throws IOException {
        new TestClass1().m1();
    }
    public void m1() throws FileNotFoundException{
        try {
            new FileInputStream(new File("xzsx"));
        }catch (Exception e){
            throw e;
        }
    }
}