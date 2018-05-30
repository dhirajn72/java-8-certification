/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 24/05/18
 */
public class SwitchTest {
    final int y;

    SwitchTest(int x){
        y=3;
    }
    SwitchTest(){
        y=3;
    }
    /*{
        y=9;
    }*/


    public static void main(String[] args) {


        int x=0;
        x=(int)123l;
        switch (x){
            case 123:
                System.out.println("it matches!!");

        }
        String[] arr=new String[4];
        System.out.println(arr.length);


    }
}
