/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 20/05/18
 */

public class TestClass{
    public static void main(String args[]){
        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++){
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);
    }
}