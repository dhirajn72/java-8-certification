/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class InitTest{
    public InitTest(){
        System.out.println("DC");
        s1 = sM1("1");
    }
    static String s1 = sM1("a");
    String s3 = sM1("2");
    {
        System.out.println("IIB");
        s1 = sM1("3");
    }
    static{
        System.out.println("SIB");
        s1 = sM1("b");
    }
    static String s2 = sM1("c");
    String s4 = sM1("4");
    public static void main(String args[]){
        InitTest it = new InitTest();
    }
    private static String sM1(String s){
        System.out.println("sm1");
        System.out.println(s);  return s;
    }
}
