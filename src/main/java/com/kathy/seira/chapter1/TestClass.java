/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

/**
 * @author Dhiraj
 * @date 16/06/18
 */
public class TestClass {
    public static void main(String[] args) {
        String s="";
        switch (0) {
            default:
                s += "d ";
            case 8:
                s += "8 ";
            case 9:
                s += "9 ";
            case 10: {
                s += "10 ";
                break;
            }

            case 13: s+= "13 ";
        }
        System.out.println(s);
    }
}
