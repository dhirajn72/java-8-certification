/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

/**
 * @author Dhiraj
 * @date 03/06/19
 */
public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    private static int  fibonacci(int number) {
        int firstNumber=0,secondNumber=1;
        int result=0;
        int i=1;
        while (i<number){
            result=firstNumber+secondNumber;
            System.out.print(result+",");
            firstNumber=secondNumber;
            secondNumber=result;
            i++;
        }
        System.out.println();
        return result;
    }
}
