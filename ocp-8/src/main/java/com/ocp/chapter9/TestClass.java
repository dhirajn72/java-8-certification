/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

/**
 * @author Dhiraj
 * @date 07/09/18
 */


interface I { }

 enum EnumA implements I { A, AA, AAA};  //1


class TestClass
{
    public enum EnumB{ B, BB, BBB;
        //public Object clone(){ return B; } //2
    }

    public static enum EnumC{ C, CC, CCC };

    //public static enum EnumD extends EnumC{ DDD }; //3

    public TestClass()
    {
       // System.out.println(EnumC.CC.index()); //4
    }


    public static void main(String[] args)
    {
        //System.out.println(EnumC.valueOf("ccc")); //5
        System.out.println(EnumC.CCC.name()); //6
    }
}