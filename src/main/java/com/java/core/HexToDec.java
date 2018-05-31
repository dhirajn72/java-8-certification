/*
 * All Rights Reserved @Dhiraj
 */

package com.java.core;

/**
 * @author Dhiraj
 * @date 13/05/18
 */
public class HexToDec {
    int x1,k=x1+1;

    public static void main(String[] args) {
        //int x1,k=x1+1;
        int x=0xE7A9;
        System.out.println(x);
        int x1=0XCAFE; // 12*16pow3 +10*16pow2+15*16pow1+14*16pow0= 49152+2560+240+14=51966
        // 0 1 2 3 4 5 6 7 8 9 a b c d e f
        System.out.println(x1);
        System.out.println(new HexToDec().x1);
        System.out.println("******");
        double[] arr=new double[50];
        //for (int i=0;i<arr.length;i++)
        //System.out.println(arr[i]);
        //System.out.println(23/0);
        System.out.println("x before passing to method::"+x1);
        HexToDec ob= new HexToDec();
        ob.doStuff(x1);
        System.out.println("x after passing to method::"+x1);

        System.out.println("********************");
        System.out.println( (  (true & false ) == (false | true)  )  );
    }
    public void doStuff(int x){
        x=x+10;
        System.out.println(x);

    }
}
