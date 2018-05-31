/*
 * All Rights Reserved @Dhiraj
 */

package com.oca.chapter1;

/**
 * @author Dhiraj
 * @date 14/05/18
 */
public class Test4 {

    public static void main(String[] args) {

        //int x;
        for (int x=0;x<5;x++){

            //break;
            //continue;
        }

        // Break or continue can always be used with loops or switch statements !
        // if (true){
        // break;
        //continue;
        //}


        try {
            method1();
        }catch (Error e){
            //System.out.println(e);
            //e.printStackTrace();
        }
        System.out.println("main successfully ends!!!");
    }

    private static void method1() {
        throw new Error();
    }

}
