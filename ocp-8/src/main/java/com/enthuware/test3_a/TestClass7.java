/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

/**
 * @author Dhiraj
 * @date 02/09/18
 */


 enum EnumA{ A, AA, AAA};  //1

public class TestClass7 //2
{
    public enum EnumB{ B, BB, BBB }; //3
    public static enum EnumC{ C, CC, CCC }; //4
    public TestClass7()
    {
        //enum EnumD{ D, DD, DDD } //5
    }

    public void methodX()
    {
        //public enum EnumE{ E, EE, EEE } //6
    }

    public static void main(String[] args) //7
    {
       // enum EnumF{ F, FF, FFF}; //8
    }
}
