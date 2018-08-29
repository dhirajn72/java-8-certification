/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

/**
 * @author Dhiraj
 * @date 25/08/18
 */

interface House{
    public default String getAddress(){
        return "101 Main Str";
    }
}

interface Office {
    public static String getAddress(){
        return "101 Smart Str";
    }
}

interface WFH extends House, Office{
}

class HomeOffice implements House, Office{
    public String getAddress(){
        //House.super.getAddress();
        return "R No 1, Home";
    }
}

public class TestClass8 {

    public static void main(String[] args) {
        Office off = new HomeOffice();  //1
        //System.out.println(Office.getAddress()); //2
        System.out.println(((House)off).getAddress());
        System.out.println();
    }
}