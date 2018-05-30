/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.mock1;

/**
 * @author Dhiraj
 * @date 29/05/18
 */
public class BoxingTest {
    public static void main(String[] args) {
        Test t= new Test();
        /*byte b1=12;
        byte b2=12;*/
        int b1=12;
        int b2=12;

        t.printSum(b1,b2);
        //t.printSum(b1,12.0);


    }
}

class Test{
    public  void printSum(int x,int y){
        System.out.println("printSum(int x,int y)");
        System.out.println(x+y);
    }
    public  void printSum(Integer x,Integer y){
        System.out.println("printSum(Integer x,Integer y");
        System.out.println(x+y);
    }
    public  void printSum(Byte x,Byte y){
        System.out.println("printSum(Byte x,Byte y)");
        System.out.println(x+y);
    }
    public  void printSum(long x,long y){
        System.out.println("printSum(long x,long y)");
        System.out.println(x+y);
    }
    public  void printSum(long x,double y){
        System.out.println("printSum(long x,double y)");
        System.out.println(x+y);
    }
    public  void printSum(byte x,byte y){
        System.out.println("printSum(byte x,byte y)");
        System.out.println(x+y);
    }
    public  void printSum(int... x){
        System.out.println("printSum(int... x)");
        System.out.println(x);
    }
}
