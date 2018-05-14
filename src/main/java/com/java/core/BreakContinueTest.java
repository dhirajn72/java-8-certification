/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 14/05/18
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        boolean flag=true;
        int x=0;
        while (flag){
            /*if (x==5){
                System.out.println(x);
                break;
            }
            x++;*/

            for (int i=0;i<5;i++){
                System.out.println("i is ::"+i);
                if (i==3){
                    System.out.println("i matched::"+i);
                    break;
                }
            }
            System.out.println("not matched!!"+x);
           // break;
        }
    }
}
