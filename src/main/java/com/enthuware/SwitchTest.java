/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 30/05/18
 */
public class SwitchTest {

    public static double getSwitch(String str) {
        return Double.parseDouble(str.substring(1, str.length() - 1));
    }

    public static void main(String args[]) {
        //switch (getSwitch(args[0])) {
            /*switch (getSwitch(args[0])) {
            case 0.0:
                System.out.println("Hello");
            case 1.0:
                System.out.println("World");
                break;
            default:
                System.out.println("Good Bye");
        }*/
            switch (-34) { //Valid
            case -34: //Valid
                System.out.println("Hello");
            case 1:
                System.out.println("World");
                break;
            default:
                System.out.println("Good Bye");
        }
    }
}

