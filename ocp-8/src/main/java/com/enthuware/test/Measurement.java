/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

/**
 * @author Dhiraj
 * @date 09/08/18
 */
/*
public interface Measurement{
    public default int getLength(){
        return 0;
    }
    public static int getBreadth(){ return 0; }

   */
/*public static int getLength(){
        return 0;
    }*//*

}

interface Size extends Measurement{
    public static final int UNIT = 100;
   //public static int getLength(){ return 10;}
}*/


public interface Measurement{
    public static int getLength(){
        return 0;
    }
    public default int getBreadth(){ return 0; }
}

interface Size extends Measurement{
    public static final int UNIT = 100;
    //public static int getLength(){ return 10;}

    public default int getLength(){
        return 0;
    }
    //public static int getBreadth(){ return 0; }
}

enum Pets
{
    DOG("D"), CAT("C"), FISH("F");
    final static String prefix = "I am "; //Non-final will end up with compilation issues
    String name;
    Pets(String s) { name = prefix + s;}
    public String getData(){ return name; }
}