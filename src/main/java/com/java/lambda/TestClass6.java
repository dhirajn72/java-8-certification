/*
 * All Rights Reserved @Dhiraj
 */

package com.java.lambda;

/**
 * @author Dhiraj
 * @date 10/06/18
 */
public class TestClass6 {

    public TestClass6(){

    }

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        b += ++z;
        int answ = x > a ? y > b ? y : b : x > z ? x : z;
        System.out.println(answ);

        float f = Float.NaN;
        x = (int) Float.NaN;
        double d = Double.NaN;
        System.out.println(f);
        System.out.println(x);
        System.out.println(d);


        System.out.println(8 / 0.0);
        System.out.println(4 + new Integer(4));
        double d2 = 0xb10_000D;
        float f2 = 0b10_000;
        long l1 = 0b10000L;
        byte b1 = 0b10;
        System.out.println(d2 + " " + f2 + " " + l1 + " " + b1);


        short s = 10;
       // char c = s;
        //s = c;
        //System.out.println(s+" "+c+" ");


    }
}

