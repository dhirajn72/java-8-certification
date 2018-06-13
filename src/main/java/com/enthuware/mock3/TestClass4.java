/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock3;

/**
 * @author Dhiraj
 * @date 10/06/18
 */


public class TestClass4{
    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];
    public static void main(String args[]) throws Exception{
        boolean x = false;
        if( b ){
            x = ( ch == ia[ch]);
        }
        else x = ( ba[ch] = b );
        System.out.println(x+" "+ba[ch]);
        System.out.println(ia[ch]==0);
        System.out.println(ch==0);
        System.out.println(ch=='\u0000');
        System.out.println(0=='\u0000');



    }
}