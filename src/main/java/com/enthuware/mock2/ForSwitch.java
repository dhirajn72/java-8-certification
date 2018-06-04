/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock2;

/**
 * @author Dhiraj
 * @date 03/06/18
 */

public class ForSwitch{
    public static void main(String args[]){
        char i;
        LOOP: for (i=0;i<5;i++){
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"+i); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }




    }
}