/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Dhiraj
 * @date 10/06/18
 */
public class TestClass5 {
}

class A1 {

    public A1() throws IOException {
    }

    void m() throws IOException {
    }
}

class B extends A1 {

    public B() throws IOException {
    }

    void m() throws FileNotFoundException {
    }
}
