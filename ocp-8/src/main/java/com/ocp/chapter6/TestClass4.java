/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.io.Closeable;

/**
 * @author Dhiraj
 * @date 12/07/18
 */
public class TestClass4 {
    public static void main(String[] args) {
        int numbers=-5;
        //assert numbers > 0;
      //  assert false : "Assertions Caught here !";
        System.out.println(numbers);

        Closeable c=null;
        System.out.println(c instanceof Object);

    }
}
