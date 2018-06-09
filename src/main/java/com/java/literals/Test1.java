/*
 * All Rights Reserved @Dhiraj
 */

package com.java.literals;

/**
 * @author Dhiraj
 * @date 21/05/18
 */
public class Test1 {
    public static void main(String[] args) {
        int a=07777777777; //Valid Octal
        System.out.println(a);
        int b=0111_1111_1111;
        System.out.println(b);
        int c=011111111117;
        System.out.println(c);
        //float f=123.34; //POP, double can't be assigned directly
        //System.out.println(f);
        //int d=(int)123l; //POP long can't be assigned to int directly, needs type cast
        //System.out.println(d);
        System.out.println((byte)130l);
        float f1=234.56f;
        short s=(short)f1;
        System.out.println(s+" "+f1);
        byte b1=(byte)128;
        System.out.println(b1);
        new Test1().m1();
    }

    public native void m1();


}
