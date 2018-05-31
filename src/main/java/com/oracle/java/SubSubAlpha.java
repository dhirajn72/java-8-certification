/*
 * All Rights Reserved @Dhiraj
 */

package com.oracle.java;

class Alpha{
    static String s=" ";
    protected Alpha(){
        System.out.println("Alpha()");
        s +="alpha ";}
}

class SubAlpha extends Alpha{
    private SubAlpha(){
        System.out.println("SubAlpha()");
        s += "sub ";}

}

public class SubSubAlpha extends Alpha{
    private SubSubAlpha(){
        System.out.println("SubSubAlpha()");
        s +="subsub ";}
    public static void main(String[] args){
        new SubSubAlpha();
        System.out.print(s);
    }

}

