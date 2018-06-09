/*
 * All Rights Reserved @Dhiraj
 */

package com.java.literals;

/**
 * @author Dhiraj
 * @date 05/06/18
 */
public class SwitchTest {
    final static short x=2;
    final static  int y=0;
    static  enum Test{MON,TUE};
    public static void main(String[] args) {
        for (int z=0;z<4;z++){
            switch (z){
                case x:
                    System.out.println("0 ");
                case x-1:
                    System.out.println("1 ");break;
                default:
                        System.out.println("def ");
                case x-3:
                    System.out.println("2 ");
            }
        }
        System.out.println("*********");
        switch (0){
            case x:
                System.out.println("0 ");
            case x-1:
                System.out.println("1 ");break;
            default:
                System.out.println("def ");
            case x-3:
                System.out.println("2 ");
        }



        switch (Test.MON){
            case MON:
        }




    }
}