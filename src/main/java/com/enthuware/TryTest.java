/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

import java.io.IOException;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class TryTest {
    public static void main(String[] args) throws Exception {
        try {
            amethod();
            System.out.println("try ");
        } //catch (IOException e) {// won't work until you throw it
            catch (Exception e) { // Works fine here
            System.out.print("catch ");
        } finally {
            System.out.print("finally ");
        }
        System.out.print("out ");
    }

    public static void amethod()  {
    }
}



