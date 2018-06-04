/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;

/**
 * @author Dhiraj
 * @date 03/06/18
 */


public class LoopTest {
    int k = 5;

    public static void main(String[] args) {
        new LoopTest().printThem();
    }

    public boolean checkIt(int k) {
        return k-->0?true:false;
    }

    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k);
        }
    }
}
